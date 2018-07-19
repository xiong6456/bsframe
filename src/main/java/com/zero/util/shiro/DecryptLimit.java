package com.zero.util.shiro;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;

/**
 * @Description 解密操作
 * @author Hevin*Xiong
 * @time 2018-2-3 下午2:19:45
 * @version 1.0.0
 */
public class DecryptLimit {
    // 声明一个缓存接口，这个接口是Shiro缓存管理的一部分，它的具体实现可以通过外部容器注入
    private Cache<String, AtomicInteger> passwordRetryCache;
    
    public DecryptLimit(CacheManager cacheManager) {
        passwordRetryCache = cacheManager.getCache("passwordRetryCache");
    }

    public boolean decryptLimit(String userName) {
        try {
			passwordRetryCache.remove(userName);
		} catch (CacheException e) {
			return false;
		}
        return true;
    }
}
