package com.zero.service.shiro;

import net.sf.json.JSONObject;

import com.zero.pojo.SysOrgDept;

/**
 * @Description 
 * @author Hevin*Xiong
 * @time 2018-2-3 上午8:46:43
 * @version 1.0.0
 */
public interface SysOrgDeptService {
	/**
	 * @Description 
	 * @param tSysOrgDept 
	 * @author Hevin*Xiong
	 * @return 
	 * @time 2018-2-11 上午11:32:41
	 */
	public JSONObject insert(SysOrgDept pSysOrgDept);
	/**
	 * @Description 查询所有部门
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:32:41
	 */
	public JSONObject select();
	/**
	 * @Description 通过fdId查询部门
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:32:41
	 */
	public JSONObject selectById(String fdId);
	/**
	 * @Description 查询上级部门
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:32:41
	 */
	public String selectParent();
	/**
	 * @Description 根据Ids删除部门
	 * @param ids
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:32:41
	 */
	public JSONObject delete(String ids);
	/**
	 * @Description 部门修改
	 * @param pSysOrgDept
	 * @return 
	 * @author Hevin*Xiong
	 * @time 2018-2-24 下午8:18:25
	 */
	public JSONObject update(SysOrgDept pSysOrgDept);
}
