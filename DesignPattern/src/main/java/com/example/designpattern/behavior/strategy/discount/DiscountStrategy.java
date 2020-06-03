package com.example.designpattern.behavior.strategy.discount;

/**
 * 打折扣策略
 */
public interface DiscountStrategy {
    double calDiscount(Order order);
}
