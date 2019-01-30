package com.dongzj.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 基于LinkedHashMap的缓存
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/30
 * Time: 11:36
 */
public class LRUMap<K, V> extends LinkedHashMap<K, V> {

    /**
     * 最大缓存数量
     */
    private int cacheSize;

    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    public LRUMap(int cacheSize) {
        super(cacheSize, DEFAULT_LOAD_FACTOR, true);
        this.cacheSize = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > cacheSize;
    }
}
