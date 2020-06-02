package com.example.designpattern.behavior.observer.case1;

import org.springframework.context.ApplicationEvent;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午3:35
 */
public class OrderEvent extends ApplicationEvent {
    public OrderEvent(Object source) {
        super(source);
    }
}
