package com.zero.sys;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @Description
 * @author Hevin*Xiong
 * @time 2018-2-11 下午1:29:43
 * @version 1.0.0
 */
public class MD5Util {
	public static String md5(String userName,String psw) {
		String hashAlgorithmName = "md5";//加密方式  
        Object crdentials = psw;//密码原值  
        ByteSource salt = ByteSource.Util.bytes(userName);//以账号作为盐值  
        int hashIterations = 2;//加密2次  
        Object result = new SimpleHash(hashAlgorithmName,crdentials,salt,hashIterations);  
		return result.toString();
	}
}
