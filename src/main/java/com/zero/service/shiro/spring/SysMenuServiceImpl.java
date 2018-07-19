package com.zero.service.shiro.spring;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONObject;

import org.jdom2.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zero.mapper.shiro.SysMenuMapper;
import com.zero.pojo.SysMenu;
import com.zero.service.shiro.SysMenuService;
import com.zero.sys.IDGenerator;

/**
 * @Description
 * @author Hevin*Xiong
 * @time 2018-2-4 下午7:51:43
 * @version 1.0.0
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {
	@Autowired
	private SysMenuMapper sysMenuMapper;

	Element dropNodeE = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * SysMenuService#queryMenusByName(java.lang.String)
	 */
	@Override
	public String queryMenusByName(String userName) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str = sdf.format(new Date());
		String strMenu = "";
		List<SysMenu> hm = null;
		// 查询菜单，当为超级管理员时无需校验
		if ("sys".equals(userName)) {
			hm = sysMenuMapper.queryMenus(null, null);
			strMenu = genMenuTree(hm);
			return strMenu;
		}
		// 查询菜单，当为管理员时需校验有效期
		if ("admin".equals(userName)) {
			hm = sysMenuMapper.queryMenus(null, str);
			strMenu = genMenuTree(hm);
			return strMenu;
		}
		hm = sysMenuMapper.queryMenus(userName, str);
		strMenu = genMenuTree(hm);
		// 查询菜单，当为普通用户时需校验有效期和权限
		return strMenu;
	}

	public String genMenuTree(List<SysMenu> map) {
		StringBuffer jsCode = new StringBuffer();
		try {
			// 第一个元素是本尊
			jsCode.append("[");
			for (int i = 0; i < map.size(); i++) {
				SysMenu tempSysMenu = (SysMenu) map.get(i);
				jsCode.append("{id:'" + tempSysMenu.getFdId() + "'");
				jsCode.append(",text:'" + tempSysMenu.getFdName() + "'");
				jsCode.append(",state:'" + tempSysMenu.getFdState() + "'");
				jsCode.append(",fdCls:'" + tempSysMenu.getFdCls() + "'");
				jsCode.append(",attributes:{url:'" + tempSysMenu.getFdRunScript() + "',iframe:'" + tempSysMenu.getFdIframe() + "'}");
				jsCode.append(",parentnodecode:'" + tempSysMenu.getFdParentId()
						+ "'");
				jsCode.append(",childflag:" + tempSysMenu.getFdChildCount());
				map.remove(tempSysMenu);
				i--;
				if (tempSysMenu.getFdChildCount() == 0) {
					jsCode.append(",isLeafx:true,leaf:true");
				} else {
					jsCode.append(",isLeafx:false,children:[ ");
					jsCode.append(queryNode(tempSysMenu.getFdId(), map));
					jsCode.append("] ");
				}
				jsCode.append("} ");

				if (map.size() != i) {
					jsCode.append(", ");
				}
			}
			jsCode.append("]");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return jsCode.toString();
	}

	public String queryNode(String ls, List<SysMenu> map) throws Exception {
		StringBuffer jsCode = new StringBuffer();

		// 第一个是本尊
		for (int i = 0; i < map.size(); i++) {
			SysMenu tempSysMenu = (SysMenu) map.get(i);
			if (ls.equals(tempSysMenu.getFdParentId())) {
				jsCode.append("{id:'" + tempSysMenu.getFdId() + "'");
				jsCode.append(",text:'" + tempSysMenu.getFdName() + "'");
				jsCode.append(",state:'" + tempSysMenu.getFdState() + "'");
				jsCode.append(",fdCls:'" + tempSysMenu.getFdCls() + "'");
				jsCode.append(",attributes:{url:'" + tempSysMenu.getFdRunScript() + "',iframe:'" + tempSysMenu.getFdIframe() + "'}");
				jsCode.append(",parentnodecode:'" + tempSysMenu.getFdParentId()
						+ "'");
				jsCode.append(",childflag:" + tempSysMenu.getFdChildCount());
				map.remove(tempSysMenu);
				i--;
				if (tempSysMenu.getFdChildCount() == 0) {
					jsCode.append(",isLeafx:true,leaf:true");
				} else {
					jsCode.append(",isLeafx:false,children:[ ");
					jsCode.append(queryNode(tempSysMenu.getFdId(), map));
					jsCode.append("] ");
				}
				jsCode.append("} ");

				if (map.size() - 1 != i) {
					jsCode.append(", ");
				}
			}
		}
		return jsCode.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SysMenuService#queryList(java.lang.String)
	 */
	@Override
	public JSONObject queryList(String fdId) {
		List<SysMenu> list = sysMenuMapper.queryList(fdId);
		JSONObject temp = new JSONObject();
		for (int i = 0; i < list.size(); i++) {
			temp.put("fdId", list.get(i).getFdId());
			temp.put("fdName", list.get(i).getFdName());
			temp.put("fdRunScript", list.get(i).getFdRunScript());
			temp.put("fdTerm", list.get(i).getFdTerm());
			temp.put("fdDueTime", list.get(i).getFdDueTime());
			temp.put("fdIframe", list.get(i).getFdIframe());
			temp.put("fdState", list.get(i).getFdState());
			temp.put("fdCls", list.get(i).getFdCls());
		}
		return temp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SysMenuService#insert(java.lang.String)
	 */
	@Override
	public JSONObject insert(SysMenu pSysMenu) {
		try {
			String fdId = pSysMenu.getFdId();

			int nodeOrder = sysMenuMapper.queryNodeOrder(fdId);
			String ischild = pSysMenu.getFdIsChild();
			// 更新菜单表的NodeOrder
			int nodeOrderTemp = (nodeOrder) + 1;
			if ("1".equals(ischild)) {
				/** 如果插入的是子节点，则将选中的节点后面所有order加1，新节点order紧跟其后 */
				sysMenuMapper.updateNodeOrderIsChild(nodeOrder);
				pSysMenu.setFdOrder(nodeOrderTemp);
				String childCount = sysMenuMapper.queryChildCountIsChild(fdId);
				/** 如果插入的是子节点，则将选中的节点ChildCount加1 */
				sysMenuMapper.updateChildCountIsChild(fdId,
						String.valueOf(Integer.parseInt(childCount) + 1));
				pSysMenu.setFdParentId(fdId);
			} else {
				/** 如果插入的是平级节点，则将选中的节点后面所有order（包括自身）加1，新节点order取代它的 */
				sysMenuMapper.updateNodeOrder(nodeOrder);
				pSysMenu.setFdOrder(nodeOrder);
				/** 如果插入的是平级节点，则将选中的父节点ChildCount加1 */
				String fdParentId = pSysMenu.getFdParentId();
				String childCount = sysMenuMapper.queryChildCount(fdParentId);
				sysMenuMapper.updateChildCount(fdParentId,
						String.valueOf(Integer.parseInt(childCount) + 1));
			}

			pSysMenu.setFdChildCount(Long.valueOf("0"));
			pSysMenu.setFdId(IDGenerator.generateID());

			sysMenuMapper.insert(pSysMenu);

			JSONObject jsonObject = new JSONObject();
			jsonObject.put("success", "true");
			jsonObject.put(
					"info",
					pSysMenu.getFdId() + "," + pSysMenu.getFdParentId() + ","
							+ pSysMenu.getFdName() + ","
							+ pSysMenu.getFdChildCount());
			return jsonObject;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * SysMenuService#queryUniqueByNodeCode(java.lang
	 * .String)
	 */
	@Override
	public int queryUniqueByParentId(String string) {
		return sysMenuMapper.queryUniqueByParentId(string);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * SysMenuService#update(SysMenu)
	 */
	@Override
	public boolean update(SysMenu pSysMenu) {
		sysMenuMapper.updateByPrimaryKeySelective(pSysMenu);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SysMenuService#delete(java.lang.String)
	 */
	@Override
	public boolean delete(String fdId) {
		sysMenuMapper.updateChildCountSub(fdId);
		sysMenuMapper.deleteByPrimaryKey(fdId);
		// 递归删除下面所有子节点
		List<SysMenu> fdIds = new ArrayList<SysMenu>();
		fdIds = deleteNode(fdId, fdIds);
		if (fdIds.size() != 0) {
			sysMenuMapper.deleteInfoBatch(fdIds);
		}
		return true;
	}

	public List<SysMenu> deleteNode(String fdId, List<SysMenu> fdIds) {
		List<SysMenu> chilList = sysMenuMapper.queryChilList(fdId);
		for (SysMenu tSysMenu : chilList) {
			fdIds.add(tSysMenu);
			if (tSysMenu.getFdParentId().length() != 0) {
				deleteNode(tSysMenu.getFdId(), fdIds);
			}
		}
		return fdIds;
	}

	/*
	 * @Override public boolean delete(String fdId) {
	 * sysMenuMapper.updateChildCountSub(fdId);
	 * sysMenuMapper.deleteByPrimaryKey(fdId); // 递归删除下面所有子节点 String[] fdIds =
	 * deleteNode(fdId); if (fdIds.length != 0) {
	 * sysMenuMapper.deleteInfoBatch(fdIds); } return true; }
	 * 
	 * public String[] deleteNode(String fdId) { List<SysMenu> chilList =
	 * sysMenuMapper.queryChilList(fdId); String[] fdIds = new
	 * String[chilList.size()]; int i=0; for (SysMenu tSysMenu : chilList) {
	 * fdIds[i] = tSysMenu.getFdId(); i++; deleteNode(tSysMenu.getFdId()); }
	 * return fdIds; }
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see SysMenuService#move(java.lang.String[])
	 */
	@Override
	public boolean move(String[] moveArray) throws Exception {
		Element root = new Element("root");
		List<SysMenu> oneLevelMenus = sysMenuMapper.queryOneLevelList();
		for (int i = 0; i < oneLevelMenus.size(); i++) {
			root.addContent(queryNode(oneLevelMenus.get(i).getFdId()));
		}

		for (int i = 0; i < moveArray.length; i++) {
			String str[] = moveArray[i].split(",");
			getDropNode(root, str[0]); // 找到移动菜单，并把此菜单从root中移除
			getTargetNode(root, str[2], str[1]); // 找到插入节点
		}

		updateNode(root, 1);// 修改数据
		return true;
	}

	public Element queryNode(String id) throws Exception {
		SysMenu tSysMenu = sysMenuMapper.selectByPrimaryKey(id);

		Element e = new Element("a" + id);
		e.setAttribute("id", tSysMenu.getFdId());
		e.setAttribute("name", tSysMenu.getFdName());
		e.setAttribute("parentnodecode", tSysMenu.getFdParentId());
		e.setAttribute("order", "" + tSysMenu.getFdOrder());

		List<SysMenu> tempMenus = sysMenuMapper.queryChilList(id);
		if (tempMenus.size() > 0) {
			for (int i = 0; i < tempMenus.size(); i++) {
				SysMenu tempSysMenu = tempMenus.get(i);

				Element temp = queryNode(tempSysMenu.getFdId());
				e.addContent(temp);
			}
		}
		return e;
	}

	public void getDropNode(Element node, String dropNode) throws Exception {
		List<Element> l = node.getChildren();

		for (int i = 0; i < l.size(); i++) {
			Element temp = (Element) l.get(i);
			if (temp.getAttribute("id").getValue().equals(dropNode)) {
				node.removeContent(temp);
				dropNodeE = temp;
				return;
			} else {
				getDropNode(temp, dropNode);
			}
		}
	}

	public void getTargetNode(Element node, String operate, String targetNode)
			throws Exception {
		List<Element> l = node.getChildren();

		for (int i = 0; i < l.size(); i++) {
			Element temp = (Element) l.get(i);
			if (temp.getAttribute("id").getValue().equals(targetNode)) {
				if (operate.equals("above")) {// 上面
					dropNodeE.removeAttribute("parentnodecode");

					dropNodeE.setAttribute("parentnodecode", ""
							+ temp.getAttribute("parentnodecode").getValue());
					l.add(i, dropNodeE);
				} else if (operate.equals("below")) {// 下面
					dropNodeE.removeAttribute("parentnodecode");
					dropNodeE.setAttribute("parentnodecode", ""
							+ temp.getAttribute("parentnodecode").getValue());
					l.add(i + 1, dropNodeE);
				} else if (operate.equals("append")) {// 包含
					dropNodeE.removeAttribute("parentnodecode");
					dropNodeE.setAttribute("parentnodecode", targetNode);
					temp.addContent(dropNodeE);
				}
				sysMenuMapper.updateParentIdById(dropNodeE.getAttribute("id")
						.getValue(), dropNodeE.getAttribute("parentnodecode")
						.getValue());

				return;
			} else {
				getTargetNode(temp, operate, targetNode);
			}
		}
	}

	public int updateNode(Element node, int n) throws Exception {
		List<Element> l = node.getChildren();
		if (node.getAttribute("id") != null) {
			sysMenuMapper.updateChildAndOrder(node.getAttribute("id")
					.getValue(), n, String.valueOf(l.size()));
		}
		for (int i = 0; i < l.size(); i++) {
			Element temp = (Element) l.get(i);
			n = updateNode(temp, ++n);

		}
		return n;

	}
}
