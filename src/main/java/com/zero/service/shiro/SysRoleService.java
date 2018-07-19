package com.zero.service.shiro;

import com.zero.pojo.SysRole;

/**
 * @Description 
 * @author Hevin*Xiong
 * @time 2018-2-28 下午7:27:46
 * @version 1.0.0
 */
public interface SysRoleService {
	/**
	 * @Description 插入角色
	 * @param pSysRole
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String insert(SysRole pSysRole);
	/**
	 * @Description 根据id删除角色
	 * @param ids
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String delete(String ids);
	/**
	 * @Description 根据id修改角色
	 * @param pSysRole
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String update(SysRole pSysRole);
	/**
	 * @Description 根据codeId类型查询出syscode json格式字符串
	 * @param codeId
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String selectById(String fdId);
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
	 * @param pSysRole 
	 * @author Hevin*Xiong
	 * @return 
	 * @time 2018-2-11 上午11:32:41
	 */
	String selectBox(SysRole pSysRole);
}
