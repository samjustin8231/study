package com.example.designpattern.behavior.strategy.discount;

/**
 * 团购价格
 *
 * @author sunyajun
 * @date 2020/4/14 11:56 AM
 */
public class GrouponDiscountStrategy implements DiscountStrategy {
    @Override
    public double calDiscount(Order order) {
        return 0;
    }
}
