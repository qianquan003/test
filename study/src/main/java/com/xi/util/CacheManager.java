package com.xi.util;

import java.util.Date;

import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;

/**
 * 操作memcace的管理类
 * @author 
 *
 */
public class CacheManager {

	private static String MemcachedClientId = "memcachedClient";//spring-memcache.xml中配置的memcachedClient
	
	public static boolean set(String key,Object value) {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		return m.set(key, value,key.hashCode());
	}
	
	public static boolean test() {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		return m.set("test", "test");
	}
	
	/**
	 * 
	 * @param key:缓存的键
	 * @param value：缓存的值
	 * @param hashCode
	 * @return
	 */
	public static boolean setByHashCode(String key,Object value,Integer hashCode) {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		return m.set(key, value,hashCode);
	}
	
	/**
	 * 
	 * @param key:缓存的键
	 * @param value：缓存的值
	 * @param date:缓存到期时间
	 * @return
	 */
	public static boolean set(String key,Object value,Date date) {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		return m.set(key, value,date,key.hashCode());
	}
	
	public static boolean setByHashCode(String key,Object value,Date date,Integer hashCode) {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		return m.set(key, value,date,hashCode);
	}
	
	public static Object get(String key) {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		return m.get(key,key.hashCode());
	}
	
	public static Object getByHashCode(String key,Integer hashCode) {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		return m.get(key,hashCode);
	}
	
	public static Object getByHashCode(String key,Integer hashCode,boolean b) {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		return m.get(key, hashCode, b);
	}
	
	public static boolean delete(String key) {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		return m.delete(key);
	}
	
	public static boolean update(String key,Object value) {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		return m.replace(key, value);
	}
	
	/**
	 * 
	 * @param key:缓存的键
	 * @param value：缓存的值
	 * @param date:缓存到期时间
	 * @return
	 */
	public static boolean update(String key,Object value,Date date) {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		return m.replace(key, value, date);
	}
	
	public static boolean updateByHashCode(String key,Object value,int hashCode) {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		return m.replace(key, value, hashCode);
	}
	
	public static boolean updateByHashCode(String key,Object value,Date date,int hashCode) {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		return m.replace(key, value,date, hashCode);
	}
	
	/**
	 * 
	 * @param key:缓存的键
	 * @param value：缓存的值
	 * @param times:缓存时间 为单位
	 * @return
	 */
	public static boolean set(String key,Object value,Long times) {
		MemCachedClient m=SpringUtil.getBean(MemcachedClientId);
		initPool();
		Date date = new Date();
		date.setTime(date.getTime()+times*1000); 
		return m.set(key, value,date);
	}
	
	private static void initPool() {
		SockIOPool so = SpringUtil.getBean("memcachedPool");
		if(!so.isInitialized()){
			long b = System.currentTimeMillis();
			so.initialize();
			so.setHashingAlg(SockIOPool.CONSISTENT_HASH);
			long e = System.currentTimeMillis();
		}
		else{
		}
	}
}
