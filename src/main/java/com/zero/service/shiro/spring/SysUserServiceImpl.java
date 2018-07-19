package com.zero.service.shiro.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zero.mapper.shiro.SysUserMapper;
import com.zero.pojo.SysUser;
import com.zero.service.shiro.SysUserService;
import com.zero.sys.IDGenerator;
import com.zero.util.JSONUtil;
import com.zero.util.shiro.PasswordHelper;
import com.zero.util.shiro.RetryLimitHashedCredentialsMatcher;

/**
 * @Description
 * @author Hevin*Xiong
 * @time 2018-2-2 下午11:55:01
 * @version 1.0.0
 */
@Service
public class SysUserServiceImpl implements SysUserService {
	private static final Logger logger = LoggerFactory
			.getLogger(SysUserServiceImpl.class);
	@Autowired
	private SysUserMapper sysUserMapper;
	@Autowired
	private RetryLimitHashedCredentialsMatcher openCache;
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * SysUserService#queryUserByName(java.lang.String)
	 */
	@Override
	public SysUser queryUserByName(String userName) {
		return sysUserMapper.queryUserByName(userName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * SysUserService#queryRolesByName(java.lang.String)
	 */
	@Override
	public Set<String> queryRolesByName(String userName) {
		return sysUserMapper.queryRolesByName(userName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * SysUserService#findPermissions(java.lang.String)
	 */
	@Override
	public Set<String> findPermissions(String userName) {
		return sysUserMapper.findPermissions(userName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * SysUserService#lockByUserName(java.lang.String)
	 */
	@Override
	public int lockByUserName(String userName) {
		return sysUserMapper.lockByUserName(userName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * SysUserService#queryUniqueByUserName(java.lang
	 * .String)
	 */
	@Override
	public int queryUniqueByUserName(String userName) {
		return sysUserMapper.queryUniqueByUserName(userName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * SysUserService#insert(SysUser)
	 */
	@Override
	public JSONObject insert(SysUser pSysUser) {
		JSONObject jsonObject = new JSONObject();
		try {
			String fdLoginName = pSysUser.getFdLoginName();
			if (fdLoginName == null || "".equals(fdLoginName)) {
				jsonObject.put("flag", "error");
				jsonObject.put("msg", "用户名不能为空！");
				return jsonObject;
			}
			int checkUnique = sysUserMapper.queryUniqueByUserName(fdLoginName);
			if (checkUnique != 0) {
				jsonObject.put("flag", "error");
				jsonObject.put("msg", "用户名已存在！");
				return jsonObject;
			}
			pSysUser.setFdPassword("123456");
			PasswordHelper tPasswordHelper = new PasswordHelper();
			tPasswordHelper.encryptPassword(pSysUser);
			pSysUser.setFdId(IDGenerator.generateID());
			sysUserMapper.insert(pSysUser);
			jsonObject.put("flag", "success");
			jsonObject.put("msg", "提交成功！");
		} catch (Exception e) {
			jsonObject.put("flag", "error");
			jsonObject.put("msg", "删除失败，原因是：" + e.getMessage());
		}
		return jsonObject;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SysUserService#select()
	 */
	@Override
	public JSONObject select() {
		JSONObject jsonObject = new JSONObject();
		List<SysUser> selectAll = sysUserMapper.selectAll();
		jsonObject.put("total", selectAll.size());
		jsonObject.put("rows", selectAll);
		jsonObject = JSONUtil.convertJSONObject(jsonObject);
		return jsonObject;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SysUserService#delete(java.lang.String[])
	 */
	@Override
	public JSONObject delete(String ids) {
		JSONObject jsonObject = new JSONObject();
		try {
			String[] fdIds = ids.split(",");
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("ids", fdIds);
			sysUserMapper.deleteByIds(map);
			jsonObject.put("flag", "success");
			jsonObject.put("msg", "删除成功！");
		} catch (Exception e) {
			logger.info("删除失败，原因是：" + e.getMessage());
			jsonObject.put("flag", "error");
			jsonObject.put("msg", "删除失败，原因是：" + e.getMessage());
		}
		return jsonObject;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SysUserService#selectById(java.lang.String)
	 */
	@Override
	public JSONObject selectById(String fdId) {
		JSONObject jsonObject = new JSONObject();
		SysUser user = sysUserMapper.selectByPrimaryKey(fdId);
		jsonObject = JSONObject.fromObject(user);
		return jsonObject;
	}

	@Override
	public JSONObject update(SysUser user) {
		JSONObject jsonObject = new JSONObject();
		try {
			sysUserMapper.updateByPrimaryKeySelective(user);
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
	 * @see SysUserService#selectBox(java.lang.String)
	 */
	@Override
	public String selectBox(SysUser pSysUser) {
		JSONObject jsonObject = new JSONObject();
//		SysUserExample tSysUserExample = new SysUserExample();
//		Criteria criteria = tSysUserExample.createCriteria();
//		if (pSysUser.getFdDeptId() != null
//				&& !"".equals(pSysUser.getFdDeptId())) {
//			criteria.andFdDeptIdEqualTo(pSysUser.getFdDeptId());
//		}
//		if (pSysUser.getFdName() != null && !"".equals(pSysUser.getFdName())) {
//			criteria.andFdNameLike("%" + pSysUser.getFdName() + "%");
//		}
//		List<SysUser> selectAll = sysUserMapper
//				.selectByExample(tSysUserExample);
		List<SysUser> selectAll =  sysUserMapper
				.selectByUser(pSysUser);
		jsonObject.put("total", selectAll.size());
		jsonObject.put("rows", selectAll);
		String json = JSONUtil.convertJSONString(jsonObject);
		return json;
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
			List<Map<String, String>> userinfo = sysUserMapper
					.selectByRoleId(fdRoleId);
			jsonArray = JSONArray.fromObject(userinfo);
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
			List<Map<String, String>> userinfo = sysUserMapper
					.unSelectByRoleId(fdRoleId);
			jsonArray = JSONArray.fromObject(userinfo);
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
			List<Map<String, String>> userinfo = sysUserMapper
					.unSelectByRoleIdandName(fdRoleId,fdName);
			jsonArray = JSONArray.fromObject(userinfo);
			rtnStr = jsonArray.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtnStr;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * SysUserService#pswUpdate(SysUser
	 * )
	 */
	@Override
	public String pswUpdate(String fdLoginName, String oldPsw, String newPsw) {
		JSONObject jsonObject = new JSONObject();
		SysUser queryUserByName = sysUserMapper.queryUserByName(fdLoginName);
		/**检验输入的用户名是否存在*/
		if (queryUserByName == null) {
			jsonObject.put("flag", "error");
			jsonObject.put("msg", "修改失败，原因是：用户名不存在！");
			return jsonObject.toString();
		}
		/**检验原密码是否正确*/
		PasswordHelper tPasswordHelper = new PasswordHelper();
		boolean flag = tPasswordHelper.checkPassword(queryUserByName.getFdSalt(),
				queryUserByName.getFdPassword(), oldPsw);
		if (flag == false) {
			jsonObject.put("flag", "error");
			jsonObject.put("msg", "修改失败，原因是：原密码错误！");
			return jsonObject.toString();
		}
		/**修改原密码*/
		newPsw = tPasswordHelper.encryptPassword(queryUserByName.getFdSalt(),newPsw);
		queryUserByName.setFdPassword(newPsw);
		sysUserMapper.updateByPrimaryKeySelective(queryUserByName);
		jsonObject.put("flag", "success");
		jsonObject.put("msg", "修改成功！");
		return jsonObject.toString();
	}

	/* (non-Javadoc)
	 * @see SysUserService#pswReset(java.lang.String)
	 */
	@Override
	public String pswReset(String fdLoginName) {
		JSONObject jsonObject = new JSONObject();
		SysUser queryUserByName = sysUserMapper.queryUserByName(fdLoginName);
		if (queryUserByName == null) {
			jsonObject.put("flag", "error");
			jsonObject.put("msg", "重置失败，原因是：用户名不存在！");
			return jsonObject.toString();
		}
		PasswordHelper tPasswordHelper = new PasswordHelper();
		String resetPsw="123456";
		resetPsw = tPasswordHelper.encryptPassword(queryUserByName.getFdSalt(),resetPsw);
		queryUserByName.setFdPassword(resetPsw);
		sysUserMapper.updateByPrimaryKeySelective(queryUserByName);
		jsonObject.put("flag", "success");
		jsonObject.put("msg", "重置成功！");
		return jsonObject.toString();
	}

	/* (non-Javadoc)
	 * @see SysUserService#pswUpdate(java.lang.String, java.lang.String)
	 */
	@Override
	public String pswOpenLock(String fdLoginName, String fdLocked) {
		JSONObject jsonObject = new JSONObject();
		SysUser queryUserByName = sysUserMapper.queryUserByName(fdLoginName);
		if (queryUserByName == null) {
			jsonObject.put("flag", "error");
			jsonObject.put("msg", "解锁失败，原因是：用户名不存在！");
			return jsonObject.toString();
		}
		
		try {
			openCache.openLock(fdLoginName);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		PasswordHelper tPasswordHelper = new PasswordHelper();
		String resetPsw="123456";
		resetPsw = tPasswordHelper.encryptPassword(queryUserByName.getFdSalt(),resetPsw);
		queryUserByName.setFdPassword(resetPsw);
		
		queryUserByName.setFdLocked(fdLocked);
		sysUserMapper.updateByPrimaryKeySelective(queryUserByName);
		jsonObject.put("flag", "success");
		jsonObject.put("msg", "解锁成功！");
		return jsonObject.toString();
	}

}
