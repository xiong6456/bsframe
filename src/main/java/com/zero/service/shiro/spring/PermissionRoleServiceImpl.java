package com.zero.service.shiro.spring;

import com.zero.mapper.shiro.SysRolePermissionMapper;
import com.zero.pojo.SysRolePermission;
import com.zero.pojo.SysRolePermissionExample;
import com.zero.pojo.SysRolePermissionExample.Criteria;
import com.zero.service.shiro.PermissionRoleService;
import com.zero.sys.IDGenerator;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @author Hevin*Xiong
 * @time 2018-2-28 下午7:29:15
 * @version 1.0.0
 */
@Service
public class PermissionRoleServiceImpl implements PermissionRoleService {
	@Autowired
	private SysRolePermissionMapper permissionRoleMapper;

	@Override
	public String update(String fdRoleId, String[] fdPermissionIds) {
		JSONObject jsonObject = new JSONObject();
		try {
			SysRolePermissionExample tSysRolePermissionExample = new SysRolePermissionExample();
			Criteria criteria = tSysRolePermissionExample.createCriteria();
			criteria.andFdRoleIdEqualTo(fdRoleId);
			permissionRoleMapper.deleteByExample(tSysRolePermissionExample);

			List<SysRolePermission> mSysRolePermission = new ArrayList<SysRolePermission>();
			for (String fdPermissionId : fdPermissionIds) {
				SysRolePermission tSysRolePermission = new SysRolePermission();
				tSysRolePermission.setFdId(IDGenerator.generateID());
				tSysRolePermission.setFdPermissionId(fdPermissionId);
				tSysRolePermission.setFdRoleId(fdRoleId);

				mSysRolePermission.add(tSysRolePermission);
			}
			permissionRoleMapper.insertInfoBatch(mSysRolePermission);
			jsonObject.put("flag", "success");
			jsonObject.put("msg", "保存成功！");
		} catch (Exception e) {
			jsonObject.put("flag", "error");
			jsonObject.put("msg", "保存失败，原因是：" + e.getMessage());
		}
		return jsonObject.toString();
	}

}
