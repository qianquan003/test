/*
package com.xi.test;

import com.danga.MemCached.MemCachedClient;
import com.xi.util.CacheManager;
import com.xi.util.SpringContextHolder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemcacheUtilTest {
    static MemCachedClient memcachedClient;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"/applicationContext-common.xml","/spring-memcache.xml"});
    }
    @Test
    public void s() {
        */
/*MemCachedClient m= SpringContextHolder.getBean("memcachedClient");
        m.set("name", "yunhui");
        System.out.println(m.get("name"));*//*

        CacheManager.set("name", "yunhui");
        System.out.println(CacheManager.get("name"));
    }
}*/
