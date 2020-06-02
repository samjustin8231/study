package com.example.designpattern.behavior.observer.case1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午3:25
 */
@Service("OrderServiceImpl")
public class OrderServiceImpl implements OrderService {

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void saveOrder(String name) {
        //1创建订单
        System.out.println("创建订单代码！");
        //通过Spring发布一个订单创建事件，监听者收到后执行相应逻辑
        applicationContext.publishEvent(new OrderEvent(name));
    }
}
