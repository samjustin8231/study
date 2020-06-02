package com.example.designpattern.behavior.strategy.discount;

/**
 * 促销打折
 * @author sunyajun
 * @date 2020/4/14 11:56 AM
 */
public class PromotionDiscountStrategy implements DiscountStrategy {
    @Override
    public double calDiscount(Order order) {
        return 0;
    }
}
