package com.example.designpattern.behavior.strategy.discount;

/**
 * 策略使用
 *
 * @author sunyajun
 * @date 2020/4/14 12:00 PM
 */
public class OrderService {

    public double discount(Order order) {
        OrderType type = order.getOrderType();
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(type);
        return discountStrategy.calDiscount(order);
    }
}
