package com.zero.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * 修改Properties文件
 * @author 熊海文
 *
 */
public class PropertiesUtil {
	/**
	 * 获取文件中key的值
	 * @param filePath 文件相对路径
	 * @param key 文件关键字的值
	 * @return 关键字对就的值
	 */
	public static String getProperty(String filePath,String key) {
		Properties prop = new Properties();
		String file = ConfigLocationsUtil.getWebContentPath()+filePath;
		try {
			prop.load(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

	/**
	 * 设置文件中key的值
	 * @param filePath 文件相对路径
	 * @param key 文件关键字的值
	 * @param value 文件关键字对应的值
	 */
	public static void setProperty(String filePath,String key,String value){
		/**
		* 将文件加载到内存中，在内存中修改key对应的value值，再将文件保存
		*/
		Properties prop = new Properties();
		String file = ConfigLocationsUtil.getWebContentPath()+filePath;
		try {
			prop.load(new FileInputStream(file));
			prop.setProperty(key, value);
			FileOutputStream fos = new FileOutputStream(file);
			prop.store(fos, null);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}