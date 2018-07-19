package com.zero.util;

import net.sf.json.JSONObject;

/**
 * @Description JSON处理
 * @author Hevin*Xiong
 * @time 2018-3-2 上午8:33:48
 * @version 1.0.0
 */
public class JSONUtil {

	/**
	 * 将属性值含有null的json对象转成含有""对象返回
	 */
	public static JSONObject convertJSONObject(JSONObject pJSONObject) {
		String tempString = pJSONObject.toString();
		tempString = tempString.replaceAll("null", "\"\"");
		pJSONObject = JSONObject.fromObject(tempString);
		return pJSONObject;
		
	}
	
	/**
	 * 将属性值含有null的json对象转成含有""json串返回返回
	 */
	public static String convertJSONString(JSONObject pJSONObject) {
		String tempString = pJSONObject.toString();
		tempString = tempString.replaceAll("null", "\"\"");
		return tempString;
	}
	
}