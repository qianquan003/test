package com.xi.util;

import com.danga.MemCached.MemCachedClient;

public class MemcacheUtil {
    public static MemCachedClient getMemCachedClient() {
        return SpringContextHolder.getBean("memcachedClient");
}
}