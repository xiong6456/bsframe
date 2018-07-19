package com.zero.service.shiro.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zero.mapper.shiro.SysOrgDeptMapper;
import com.zero.pojo.SysOrgDept;
import com.zero.pojo.SysOrgDeptExample;
import com.zero.pojo.SysUser;
import com.zero.service.shiro.SysOrgDeptService;
import com.zero.sys.IDGenerator;

/**
 * @Description
 * @author Hevin*Xiong
 * @time 2018-2-2 下午11:55:01
 * @version 1.0.0
 */
@Service
public class SysOrgDeptServiceImpl implements SysOrgDeptService {
	private static final Logger logger = LoggerFactory
			.getLogger(SysOrgDeptServiceImpl.class);
	@Autowired
	private SysOrgDeptMapper sysOrgDeptMapper;
	/*
	 * (non-Javadoc)
	 * 
	 * @see SysOrgDeptService#insert(com.zero.pojo.shiro.
	 * SysOrgDept)
	 */
	@Override
	public JSONObject insert(SysOrgDept pSysOrgDept) {
		JSONObject jsonObject = new JSONObject();
		try {
			String fdName = pSysOrgDept.getFdName();
			if (fdName == null || "".equals(fdName)) {
				jsonObject.put("flag", "error");
				jsonObject.put("msg", "部门名不能为空！");
				return jsonObject;
			}
			int checkUnique = sysOrgDeptMapper.queryUniqueByOrgDeptName(fdName);
			if (checkUnique != 0) {
				jsonObject.put("flag", "error");
				jsonObject.put("msg", "部门名已存在！");
				return jsonObject;
			}
			updateOrdAndChild(pSysOrgDept);
			pSysOrgDept.setFdId(IDGenerator.generateID());
			sysOrgDeptMapper.insert(pSysOrgDept);
			jsonObject.put("flag", "success");
			jsonObject.put("msg", "提交成功！");
		} catch (Exception e) {
			jsonObject.put("flag", "error");
			jsonObject.put("msg", "提交失败，原因是：" + e.getMessage());
		}
		return jsonObject;
	}

	/**
	 * <p>
	 * 更新子节点个数和排序号
	 * </p>
	 * <p>
	 * 如果上级组织为空，则排序号最大值加1，反之排序号为父节点中的子节点排序号最大值加1，其最大子节点后所有排序号加1
	 * </p>
	 * <p>
	 * 如果上级组织为空，则子节点个数为不更新，反之子节点个数为父节点中的子节点个数加1，其新加入的子节点数为0
	 * </p>
	 */
	public void updateOrdAndChild(SysOrgDept pSysOrgDept) {
		String fdParentId = pSysOrgDept.getFdParentId();
		int nodeOrder = 0;
		if (!"".equals(fdParentId) && fdParentId != null) {
			/** 如果父节点不为空，则将选中的节点ChildCount加1 */
			nodeOrder = sysOrgDeptMapper.queryFdOrder(fdParentId);
			// 更新NodeOrder
			sysOrgDeptMapper.updateFdOrder(nodeOrder);
			sysOrgDeptMapper.updateChildCount(fdParentId);
		} else {
			/** 如果父节点为空 */
			nodeOrder = sysOrgDeptMapper.queryMaxFdOrder();
			
		}

		pSysOrgDept.setFdOrder(nodeOrder);
		pSysOrgDept.setFdChildCount("0");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SysOrgDeptService#select()
	 */
	@Override
	public JSONObject select() {
		JSONObject jsonObject = new JSONObject();
		List<SysOrgDept> selectByExample = sysOrgDeptMapper
				.selectByExample(null);
		jsonObject.put("total", selectByExample.size());
		jsonObject.put("rows", selectByExample);
		return jsonObject;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SysOrgDeptService#delete(java.lang.String[])
	 */
	@Override
	public JSONObject delete(String fdId) {
		JSONObject jsonObject = new JSONObject();
		try {
			sysOrgDeptMapper.updateChildCountSub(fdId);
			sysOrgDeptMapper.deleteByPrimaryKey(fdId);
			// 递归删除下面所有子节点
			String[] fdIds = deleteNode(fdId);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("ids", fdIds);
			if (fdIds.length != 0) {
				sysOrgDeptMapper.deleteInfoBatch(map);
			}
			jsonObject.put("msg", "删除成功！");
		} catch (Exception e) {
			logger.info("删除失败，原因是：" + e.getMessage());
			jsonObject.put("msg", "删除失败，原因是：" + e.getMessage());
		}
		return jsonObject;
	}

	public String[] deleteNode(String fdId) {
		List<SysOrgDept> chilList = sysOrgDeptMapper.queryChilList(fdId);
		String[] fdIds = new String[chilList.size()];
		int i = 0;
		for (SysOrgDept tSysOrgDept : chilList) {
			fdIds[i] = tSysOrgDept.getFdId();
			i++;
			deleteNode(tSysOrgDept.getFdId());
		}
		return fdIds;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * SysOrgDeptService#selectById(java.lang.String)
	 */
	@Override
	public JSONObject selectById(String fdId) {
		JSONObject jsonObject = new JSONObject();
		SysOrgDept tSysOrgDept = sysOrgDeptMapper.selectByPrimaryKey(fdId);
		jsonObject = JSONObject.fromObject(tSysOrgDept);
		return jsonObject;
	}

	@Override
	public JSONObject update(SysOrgDept pSysOrgDept) {
		JSONObject jsonObject = new JSONObject();
		try {
			sysOrgDeptMapper.updateByPrimaryKeySelective(pSysOrgDept);
			jsonObject.put("flag", "success");
			jsonObject.put("msg", "修改成功！");
		} catch (Exception e) {
			logger.info("修改失败，原因是：" + e.getMessage());
			jsonObject.put("flag", "error");
			jsonObject.put("msg", "修改失败，原因是：" + e.getMessage());
		}
		return jsonObject;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SysOrgDeptService#selectParent()
	 */
	@Override
	public String selectParent() {
		String strDeptParent = "";
		Subject subject = SecurityUtils.getSubject();
		SysUser tSysUser = (SysUser)subject.getSession().getAttribute("userInfo");
		String fdDeptId = tSysUser.getFdDeptId();
		SysOrgDeptExample tSysOrgDeptExample = new SysOrgDeptExample();
		tSysOrgDeptExample.setOrderByClause("fd_order");
		/*List<SysOrgDept> selectByExample = sysOrgDeptMapper
				.selectByExample(tSysOrgDeptExample);*/
		List<SysOrgDept> selectByExample = null;
		if("admin".equals(tSysUser.getFdLoginName()) || "sys".equals(tSysUser.getFdLoginName())) {
			selectByExample = sysOrgDeptMapper.selectList();
		}else{
			selectByExample = sysOrgDeptMapper.selectAll(fdDeptId);
		}
		strDeptParent = genDeptTree(selectByExample);
		strDeptParent = strDeptParent.replaceAll("null", "");
		return strDeptParent;
	}

	public String genDeptTree(List<SysOrgDept> map) {
		StringBuffer jsCode = new StringBuffer();
		try {
			// 第一个元素是本尊
			jsCode.append("[");
			for (int i = 0; i < map.size(); i++) {
				SysOrgDept tempSysOrgDept = (SysOrgDept) map.get(i);
				jsCode.append("{\"id\":\"" + tempSysOrgDept.getFdId() + "\"");
				jsCode.append(",\"text\":\"" + tempSysOrgDept.getFdName() + "\"");
				jsCode.append(",\"fdType\":\"" + tempSysOrgDept.getFdType() + "\"");
				jsCode.append(",\"fdMajorId\":\"" + tempSysOrgDept.getFdMajorId() + "\"");
				jsCode.append(",\"fdMinorId\":\"" + tempSysOrgDept.getFdMinorId() + "\"");
				jsCode.append(",\"fdMajorName\":\"" + tempSysOrgDept.getFdMajorName() + "\"");
				jsCode.append(",\"fdMinorName\":\"" + tempSysOrgDept.getFdMinorName() + "\"");
				if(tempSysOrgDept.getFdSysCode().getCodeName() != null) {
					jsCode.append(",\"fdSysCode\":\"" + tempSysOrgDept.getFdSysCode().getCodeName() + "\"");
				}else{
					jsCode.append(",\"fdSysCode\":\"\"");
				}
				map.remove(tempSysOrgDept);
				i--;
				if (!"0".equals(tempSysOrgDept.getFdChildCount())) {
					jsCode.append(",\"children\":[ ");
					jsCode.append(queryNode(tempSysOrgDept.getFdId(), map));
					jsCode.append("] ");
				}
				jsCode.append("} ");
				
				if (map.size()-1 != i) {
					jsCode.append(", ");
				}
				
			}
			jsCode.append("]");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return jsCode.toString();
	}

	public String queryNode(String ls, List<SysOrgDept> map) throws Exception {
		StringBuffer jsCode = new StringBuffer();
		//标记父节点的子节点数
		int k = 0;
		k=sysOrgDeptMapper.queryCountChildren(ls);
		// 第一个是本尊
		for (int i = 0; i < map.size(); i++) {
			SysOrgDept tempSysOrgDept = (SysOrgDept) map.get(i);
			if (ls.equals(tempSysOrgDept.getFdParentId())) {
				jsCode.append("{\"id\":\"" + tempSysOrgDept.getFdId() + "\"");
				jsCode.append(",\"text\":\"" + tempSysOrgDept.getFdName() + "\"");
				jsCode.append(",\"fdType\":\"" + tempSysOrgDept.getFdType() + "\"");
				jsCode.append(",\"fdMajorId\":\"" + tempSysOrgDept.getFdMajorId() + "\"");
				jsCode.append(",\"fdMinorId\":\"" + tempSysOrgDept.getFdMinorId() + "\"");
				jsCode.append(",\"fdMajorName\":\"" + tempSysOrgDept.getFdMajorName() + "\"");
				jsCode.append(",\"fdMinorName\":\"" + tempSysOrgDept.getFdMinorName() + "\"");
				if(tempSysOrgDept.getFdSysCode().getCodeName() != null) {
					jsCode.append(",\"fdSysCode\":\"" + tempSysOrgDept.getFdSysCode().getCodeName() + "\"");
				}else{
					jsCode.append(",\"fdSysCode\":\"\"");
				}
				map.remove(tempSysOrgDept);
				i--;
				k--;
				if (!"0".equals(tempSysOrgDept.getFdChildCount())) {
					jsCode.append(",\"children\":[ ");
					jsCode.append(queryNode(tempSysOrgDept.getFdId(), map));
					jsCode.append("] ");
				}
				jsCode.append("} ");

				if (map.size() != i+1&&k>0) {
					jsCode.append(", ");
				}
			}
		}
		return jsCode.toString();
	}
}
