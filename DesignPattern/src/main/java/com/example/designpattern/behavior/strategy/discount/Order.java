package com.example.designpattern.behavior.strategy.discount;

import lombok.Data;

/**
 * 订单类
 *
 * @author sunyajun
 * @date 2020/4/14 11:56 AM
 */
@Data
public class Order {

    private OrderType orderType;

    private double price;

}
