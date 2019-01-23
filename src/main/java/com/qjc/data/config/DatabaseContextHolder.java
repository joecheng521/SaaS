package com.qjc.data.config;

public class DatabaseContextHolder {
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
	 
	public static void setDBKey(String dataSourceKey) {
		contextHolder.set(dataSourceKey);
	}
 
	public static String getDBKey() {
		return contextHolder.get();
	}
 
	public static void clearDBKey() {
		contextHolder.remove();
	}
}
