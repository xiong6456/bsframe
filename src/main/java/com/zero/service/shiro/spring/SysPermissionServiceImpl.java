package com.zero.service.shiro.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zero.mapper.shiro.SysPermissionMapper;
import com.zero.pojo.SysPermission;
import com.zero.pojo.SysPermissionExample;
import com.zero.pojo.SysPermissionExample.Criteria;
import com.zero.service.shiro.SysPermissionService;
import com.zero.sys.IDGenerator;
import com.zero.util.JSONUtil;

/**
 * @Description
 * @author Hevin*Xiong
 * @time 2018-2-28 下午7:29:15
 * @version 1.0.0
 */
@Service
public class SysPermissionServiceImpl implements SysPermissionService {
	@Autowired
	private SysPermissionMapper sysPermissionMapper;


	/* (non-Javadoc)
	 * @see com.zero.service.sys.SysPermissionService#insert(com.zero.pojo.sys.SysPermission)
	 */
	@Override
	public String insert(SysPermission pSysPermission) {
		JSONObject jsonObject = new JSONObject();
		try {
			pSysPermission.setFdId(IDGenerator.generateID());
			sysPermissionMapper.insert(pSysPermission);
			jsonObject.put("flag", "success");
        	jsonObject.put("msg", "添加成功！");
		} catch (Exception e) {
			jsonObject.put("flag", "error");
        	jsonObject.put("msg", "添加失败，原因是："+e.getMessage());
		}
		return jsonObject.toString();
	}

	/* (non-Javadoc)
	 * @see com.zero.service.sys.SysPermissionService#delete(java.lang.String)
	 */
	@Override
	public String delete(String ids) {
		JSONObject jsonObject = new JSONObject();
		try {
			String[] fdIds = ids.split(",");
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("ids", fdIds);
			sysPermissionMapper.deleteByIds(map);
			jsonObject.put("flag", "success");
        	jsonObject.put("msg", "删除成功！");
		} catch (Exception e) {
			jsonObject.put("flag", "error");
        	jsonObject.put("msg", "删除失败，原因是："+e.getMessage());
		}
		return jsonObject.toString();
	}

	/* (non-Javadoc)
	 * @see com.zero.service.sys.SysPermissionService#update(com.zero.pojo.sys.SysPermission)
	 */
	@Override
	public String update(SysPermission pSysPermission) {
		JSONObject jsonObject = new JSONObject();
		try {
			sysPermissionMapper.updateByPrimaryKeySelective(pSysPermission);
			jsonObject.put("flag", "success");
        	jsonObject.put("msg", "修改成功！");
		} catch (Exception e) {
			jsonObject.put("flag", "error");
        	jsonObject.put("msg", "修改失败，原因是："+e.getMessage());
		}
		return jsonObject.toString();
	}

	
	/* (non-Javadoc)
	 * @see com.zero.service.sys.SysPermissionService#select()
	 */
	@Override
	public String select() {
		JSONObject jsonObject = new JSONObject();
		SysPermissionExample tSysPermissionExample = new SysPermissionExample();
		try {
			List<SysPermission> selectByExample = sysPermissionMapper.selectByExample(tSysPermissionExample);
			jsonObject.put("total", selectByExample.size());
			jsonObject.put("rows", selectByExample);
			jsonObject.put("flag", "success");
        	jsonObject.put("msg", "查询成功！");
        	return JSONUtil.convertJSONString(jsonObject);
		} catch (Exception e) {
			jsonObject.put("flag", "error");
        	jsonObject.put("msg", "查询失败，原因是："+e.getMessage());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.zero.service.sys.SysPermissionService#selectByCodeId(java.lang.String)
	 */
	@Override
	public String selectById(String fdId) {
		JSONObject jsonObject = new JSONObject();
		try {
			SysPermission sysPermission = sysPermissionMapper.selectByPrimaryKey(fdId);
			jsonObject = JSONObject.fromObject(sysPermission);
			jsonObject.put("flag", "success");
		} catch (Exception e) {
			jsonObject.put("flag", "error");
        	jsonObject.put("msg", "查询失败，原因是："+e.getMessage());
		}
		return JSONUtil.convertJSONString(jsonObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * SysUserService#selectByRoleId(java.lang.String)
	 */
	@Override
	public String selectByRoleId(String fdRoleId) {
		String rtnStr = "";
		try {
			JSONArray jsonArray = new JSONArray();
			List<Map<String, String>> permissioninfo = sysPermissionMapper
					.selectByRoleId(fdRoleId);
			jsonArray = JSONArray.fromObject(permissioninfo);
			rtnStr = jsonArray.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtnStr;
	}


	/* (non-Javadoc)
	 * @see SysUserService#unSelectByRoleId(java.lang.String)
	 */
	@Override
	public String unSelectByRoleId(String fdRoleId) {
		String rtnStr = "";
		try {
			JSONArray jsonArray = new JSONArray();
			List<Map<String, String>> permissioninfo = sysPermissionMapper
					.unSelectByRoleId(fdRoleId);
			jsonArray = JSONArray.fromObject(permissioninfo);
			rtnStr = jsonArray.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtnStr;
	}
	
	/* (non-Javadoc)
	 * @see SysUserService#unSelectByRoleIdandName(java.lang.String, java.lang.String)
	 */
	@Override
	public String unSelectByRoleIdandName(String fdRoleId, String fdName) {
		String rtnStr = "";
		try {
			fdName = "%" + fdName + "%";
			JSONArray jsonArray = new JSONArray();
			List<Map<String, String>> permissioninfo = sysPermissionMapper
					.unSelectByRoleIdandName(fdRoleId,fdName);
			jsonArray = JSONArray.fromObject(permissioninfo);
			rtnStr = jsonArray.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtnStr;
	}
	
	/* (non-Javadoc)
	 * @see com.zero.service.sys.SysPermissionService#selectBox(com.zero.pojo.sys.SysPermission)
	 */
	@Override
	public String selectBox(SysPermission pSysPermission) {
		JSONObject jsonObject = new JSONObject();
		SysPermissionExample tSysPermissionExample = new SysPermissionExample();
		Criteria criteria = tSysPermissionExample.createCriteria();
		if(pSysPermission.getFdName() != null && !"".equals(pSysPermission.getFdName())) {
			criteria.andFdNameLike("%"+pSysPermission.getFdName()+"%");
		}
		
		List<SysPermission> selectAll = sysPermissionMapper.selectByExample(tSysPermissionExample);
		jsonObject.put("total", selectAll.size());
		jsonObject.put("rows", selectAll);
		String json = JSONUtil.convertJSONString(jsonObject);
		return json;
	}

}
