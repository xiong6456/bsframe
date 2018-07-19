package com.zero.service.sys;

import com.zero.pojo.sys.SysCode;

/**
 * @Description 
 * @author Hevin*Xiong
 * @time 2018-2-28 下午7:27:46
 * @version 1.0.0
 */
public interface SysCodeService {
	/**
	 * @Description 插入枚举
	 * @param codeType
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String insert(SysCode pSysCode);
	/**
	 * @Description 根据id删除枚举
	 * @param ids
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String delete(String ids);
	/**
	 * @Description 根据id修改枚举
	 * @param pSysCode
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String update(SysCode pSysCode);
	/**
	 * @Description 根据类型查询出syscode json格式字符串
	 * @param codeType
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String select(String codeType);
	/**
	 * @Description 根据codeId类型查询出syscode json格式字符串
	 * @param codeId
	 * @return String
	 * @author Hevin*Xiong
	 * @time 2018-2-28 下午7:38:45
	 */
	String selectByCodeId(String codeId);
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
	 * @param pSysCode 
	 * @author Hevin*Xiong
	 * @return 
	 * @time 2018-2-11 上午11:32:41
	 */
	String selectBox(SysCode pSysCode);
}
