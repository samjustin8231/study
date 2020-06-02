package com.example.designpattern.behavior.observer.case1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午3:36
 */
@Component("smsListener")
public class SmsListener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return aClass == OrderEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> aClass) {
        return true;
    }

    /**
     * 收到事件后，执行的业务
     *
     * @param applicationEvent
     */
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("执行发短信的业务");
    }

    @Override
    public int getOrder() {
        //多个监听者，可以定义顺序
        return 0;
    }
}
