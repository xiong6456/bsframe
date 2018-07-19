package com.zero.service.shiro.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zero.mapper.shiro.SysRoleMapper;
import com.zero.mapper.shiro.SysRolePermissionMapper;
import com.zero.mapper.shiro.SysUserRoleMapper;
import com.zero.pojo.SysRole;
import com.zero.pojo.SysRoleExample;
import com.zero.pojo.SysRoleExample.Criteria;
import com.zero.service.shiro.SysRoleService;
import com.zero.sys.IDGenerator;
import com.zero.util.JSONUtil;

/**
 * @Description
 * @author Hevin*Xiong
 * @time 2018-2-28 下午7:29:15
 * @version 1.0.0
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
	@Autowired
	private SysRoleMapper sysRoleMapper;
	@Autowired
	private SysUserRoleMapper sysUserRoleMapper;
	@Autowired
	private SysRolePermissionMapper sysRolePermissionMapper;

	/* (non-Javadoc)
	 * @see com.zero.service.sys.SysRoleService#insert(com.zero.pojo.sys.SysRole)
	 */
	@Override
	public String insert(SysRole pSysRole) {
		JSONObject jsonObject = new JSONObject();
		try {
			pSysRole.setFdId(IDGenerator.generateID());
			sysRoleMapper.insert(pSysRole);
			jsonObject.put("flag", "success");
        	jsonObject.put("msg", "添加成功！");
		} catch (Exception e) {
			jsonObject.put("flag", "error");
        	jsonObject.put("msg", "添加失败，原因是："+e.getMessage());
		}
		return jsonObject.toString();
	}

	/* (non-Javadoc)
	 * @see com.zero.service.sys.SysRoleService#delete(java.lang.String)
	 */
	@Override
	public String delete(String ids) {
		JSONObject jsonObject = new JSONObject();
		try {
			String[] fdIds = ids.split(",");
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("ids", fdIds);
			sysRoleMapper.deleteByIds(map);
			/**删除用户角色表中信息*/
			sysUserRoleMapper.deleteByIds(map);
			/**删除资源角色表中信息*/
			sysRolePermissionMapper.deleteByIds(map);
			
			jsonObject.put("flag", "success");
        	jsonObject.put("msg", "删除成功！");
		} catch (Exception e) {
			jsonObject.put("flag", "error");
        	jsonObject.put("msg", "删除失败，原因是："+e.getMessage());
		}
		return jsonObject.toString();
	}

	/* (non-Javadoc)
	 * @see com.zero.service.sys.SysRoleService#update(com.zero.pojo.sys.SysRole)
	 */
	@Override
	public String update(SysRole pSysRole) {
		JSONObject jsonObject = new JSONObject();
		try {
			sysRoleMapper.updateByPrimaryKeySelective(pSysRole);
			jsonObject.put("flag", "success");
        	jsonObject.put("msg", "修改成功！");
		} catch (Exception e) {
			jsonObject.put("flag", "error");
        	jsonObject.put("msg", "修改失败，原因是："+e.getMessage());
		}
		return jsonObject.toString();
	}

	
	/* (non-Javadoc)
	 * @see com.zero.service.sys.SysRoleService#select()
	 */
	@Override
	public String select() {
		JSONObject jsonObject = new JSONObject();
		SysRoleExample tSysRoleExample = new SysRoleExample();
		tSysRoleExample.createCriteria().andFdCodeNotEqualTo("ROLE_SYS");
		try {
			List<SysRole> selectByExample = sysRoleMapper.selectByExample(tSysRoleExample);
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
	 * @see com.zero.service.sys.SysRoleService#selectByCodeId(java.lang.String)
	 */
	@Override
	public String selectById(String fdId) {
		JSONObject jsonObject = new JSONObject();
		try {
			SysRole sysRole = sysRoleMapper.selectByPrimaryKey(fdId);
			jsonObject = JSONObject.fromObject(sysRole);
			jsonObject.put("flag", "success");
		} catch (Exception e) {
			jsonObject.put("flag", "error");
        	jsonObject.put("msg", "查询失败，原因是："+e.getMessage());
		}
		return JSONUtil.convertJSONString(jsonObject);
	}

	/* (non-Javadoc)
	 * @see com.zero.service.sys.SysRoleService#selectBox(com.zero.pojo.sys.SysRole)
	 */
	@Override
	public String selectBox(SysRole pSysRole) {
		JSONObject jsonObject = new JSONObject();
		SysRoleExample tSysRoleExample = new SysRoleExample();
		Criteria criteria = tSysRoleExample.createCriteria();
		if(pSysRole.getFdName() != null && !"".equals(pSysRole.getFdName())) {
			criteria.andFdNameLike("%"+pSysRole.getFdName()+"%");
		}
		
		if(pSysRole.getFdDescription() != null && !"".equals(pSysRole.getFdDescription())) {
			criteria.andFdDescriptionLike("%"+pSysRole.getFdDescription()+"%");
		}
		
		List<SysRole> selectAll = sysRoleMapper.selectByExample(tSysRoleExample);
		jsonObject.put("total", selectAll.size());
		jsonObject.put("rows", selectAll);
		String json = JSONUtil.convertJSONString(jsonObject);
		return json;
	}

}
