package com.example.designpattern.behavior.strategy.discount;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunyajun
 * @date 2020/4/14 11:58 AM
 */
public class DiscountStrategyFactory {
    private static final Map<OrderType, DiscountStrategy> strategies = new HashMap<>();

    static {
        strategies.put(OrderType.NORMAL, new NormalDiscountStrategy());
        strategies.put(OrderType.GROUPON, new GrouponDiscountStrategy());
        strategies.put(OrderType.PROMOTION, new PromotionDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(OrderType type) {
        return strategies.get(type);
    }
}
