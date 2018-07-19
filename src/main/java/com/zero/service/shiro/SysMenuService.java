package com.zero.service.shiro;

import net.sf.json.JSONObject;

import com.zero.pojo.SysMenu;


/**
 * @Description 
 * @author Hevin*Xiong
 * @time 2018-2-3 上午8:46:43
 * @version 1.0.0
 */
public interface SysMenuService {
    public String queryMenusByName(String userName);
    /**
	 * @Description 修改页面数据查询
	 * @param string 
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:28:54
	 */
    public JSONObject queryList(String fdId);
    /**
   	 * @Description 新增菜单
   	 * @param string 
   	 * @author Hevin*Xiong
   	 * @time 2018-2-11 上午11:28:54
   	 */
    public JSONObject insert(SysMenu pSysMenu);
    /**
   	 * @Description 删除菜单
   	 * @param string 
   	 * @author Hevin*Xiong
   	 * @time 2018-2-11 上午11:28:54
   	 */
    public boolean delete(String fdId);
    /**
	 * @Description 
	 * @param SysMenu pSysMenu 
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:28:54
	 */
	public boolean update(SysMenu pSysMenu);
	/**
	 * @Description 移动菜单
	 * @param String[] moveArray
	 * @author Hevin*Xiong
	 * @throws Exception 
	 * @time 2018-2-11 上午11:28:54
	 */
	public boolean move(String[] moveArray) throws Exception;
    /**
	 * @Description 
	 * @param string 
	 * @author Hevin*Xiong
	 * @time 2018-2-11 上午11:28:54
	 */
	public int queryUniqueByParentId(String string);
}
