package com.zero.service.shiro;

import java.util.Set;

import net.sf.json.JSONObject;

import com.zero.pojo.SysUser;

/**
 * @Description 
 * @author Hevin*Xiong
 * @time 2018-2-3 上午8:46:43
 * @version 1.0.0
 */
public interface SysUserService {
	public SysUser queryUserByName(String userName);
    public Set<String> queryRolesByName(String userName);
    public Set<String> findPermissions(String userName);
    /**
	 * @Description 密码输入5次错误就锁帐户
	 * @param string 
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:28:54
	 */
    int lockByUserName(String userName);
	/**
	 * @Description 
	 * @param string 
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:28:54
	 */
	public int queryUniqueByUserName(String string);
	/**
	 * @Description 
	 * @param tSysUser 
	 * @author Hevin*Xiong
	 * @return 
	 * @time 2018-2-11 上午11:32:41
	 */
	public JSONObject insert(SysUser pSysUser);
	/**
	 * @Description 根据查询条件查询数据
	 * @param pSysUser 
	 * @author Hevin*Xiong
	 * @return 
	 * @time 2018-2-11 上午11:32:41
	 */
	public String selectBox(SysUser pSysUser);
	/**
	 * @Description 查询所有用户
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:32:41
	 */
	public JSONObject select();
	/**
	 * @Description 通过fdId查询所有用户
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:32:41
	 */
	public JSONObject selectById(String fdId);
	/**
	 * @Description 通过角色id查询已选择角色的用户
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:32:41
	 */
	public String selectByRoleId(String fdRoleId);
	/**
	 * @Description 通过角色id查询未选择角色的用户
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:32:41
	 */
	public String unSelectByRoleId(String fdRoleId);
	/**
	 * @Description 通过角色id和人员名称查询未选择角色的用户
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:32:41
	 */
	public String unSelectByRoleIdandName(String fdRoleId, String fdName);
	/**
	 * @Description 根据Ids删除数据
	 * @param ids
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:32:41
	 */
	public JSONObject delete(String ids);
	/**
	 * @Description 用户修改
	 * @param user
	 * @return 
	 * @author Hevin*Xiong
	 * @time 2018-2-24 下午8:18:25
	 */
	public JSONObject update(SysUser user);
	/**
	 * @Description 密码修改
	 * @param fdLoginName
	 * @param oldPsw
	 * @param newPsw
	 * @return 
	 * @author Hevin*Xiong
	 * @time 2018-2-24 下午8:18:25
	 */
	public String pswUpdate(String fdLoginName, String oldPsw, String newPsw);
	/**
	 * @Description 密码重置
	 * @param fdLoginName
	 * @return 
	 * @author Hevin*Xiong
	 * @time 2018-2-24 下午8:18:25
	 */
	public String pswReset(String fdLoginName);
	/**
	 * @Description 帐户解锁
	 * @param fdLoginName
	 * @param fdLock
	 * @return 
	 * @author Hevin*Xiong
	 * @time 2018-2-24 下午8:18:25
	 */
	public String pswOpenLock(String fdLoginName, String fdLock);
}
