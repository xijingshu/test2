package com.byshj.common.dao;

import java.io.IOException;
import java.util.Properties;

/**
 * Dao工厂
 * @author:Liqk
 * @Date:2017年8月10日
*/
public class DaoFactory {
	
	private static Properties prop = new Properties();
	private DaoFactory(){}
	
	static{
		
		try {
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("dao.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("在classpath下未找到dao.properties文件");
		}
		
	}
	
	
	public static Object getDaoImpl(String str){
		Object obj = null;
		try {
			obj = Class.forName(prop.getProperty(str)).newInstance();
			System.out.println(obj.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}
	

}
