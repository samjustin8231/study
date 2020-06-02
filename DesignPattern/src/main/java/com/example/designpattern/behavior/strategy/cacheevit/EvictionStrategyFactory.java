package com.example.designpattern.behavior.strategy.cacheevit;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunyajun
 * @date 2020/4/14 11:53 AM
 */
public class EvictionStrategyFactory {

    private static final Map<String, EvictionStrategy> strategies = new HashMap<>();

    static {
        strategies.put("lru", new LruEvictionStrategy());
        strategies.put("fifo", new FifoEvictionStrategy());
        strategies.put("lfu", new LfuEvictionStrategy());
    }

    public static EvictionStrategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }
}
