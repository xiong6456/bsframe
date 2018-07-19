package com.zero.service.shiro;


/**
 * @Description 
 * @author Hevin*Xiong
 * @time 2018-2-28 下午7:27:46
 * @version 1.0.0
 */
public interface PermissionRoleService {
	/**
	 * @Description 根据角色id修改角色对应的资源
	 * @param fdRoleId
	 * @param fdUserIds
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String update(String fdRoleId, String[] fdUserIds);
}
