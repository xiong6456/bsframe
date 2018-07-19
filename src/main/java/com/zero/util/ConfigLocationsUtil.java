package com.zero.util;

public class ConfigLocationsUtil {
    /**
     * 获取 到classes目录的全路径
     */
    public static String getWebContentPath(){
        return ConfigLocationsUtil.class.getResource("/").getPath();
    }

}
