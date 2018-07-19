package com.zero.service.shiro;

import com.zero.pojo.SysPermission;

/**
 * @Description 
 * @author Hevin*Xiong
 * @time 2018-2-28 下午7:27:46
 * @version 1.0.0
 */
public interface SysPermissionService {
	/**
	 * @Description 插入权限
	 * @param pSysPermission
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String insert(SysPermission pSysPermission);
	/**
	 * @Description 根据id删除权限
	 * @param ids
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String delete(String ids);
	/**
	 * @Description 根据id修改权限
	 * @param pSysPermission
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String update(SysPermission pSysPermission);
	/**
	 * @Description 根据fdId类型查询权限
	 * @param codeId
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String selectById(String fdId);
	/**
	 * @Description 通过角色id查询已选择角色的资源
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:32:41
	 */
	public String selectByRoleId(String fdRoleId);
	/**
	 * @Description 通过角色id查询未选择角色的用资源
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:32:41
	 */
	public String unSelectByRoleId(String fdRoleId);
	/**
	 * @Description 通过角色id和人员名称查询未选择角色的资源
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:32:41
	 */
	public String unSelectByRoleIdandName(String fdRoleId, String fdName);
	/**
	 * @Description 查询所有
	 * @param 
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String select();
	/**
	 * @Description 根据查询条件查询数据
	 * @param pSysPermission 
	 * @author Hevin*Xiong
	 * @return 
	 * @time 2018-2-11 上午11:32:41
	 */
	String selectBox(SysPermission pSysPermission);
}
