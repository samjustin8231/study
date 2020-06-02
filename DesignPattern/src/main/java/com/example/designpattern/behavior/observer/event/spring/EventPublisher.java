package com.example.designpattern.behavior.observer.event.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @author sunyajun
 * @date 2020/4/14 4:27 PM
 */
@Component
public class EventPublisher implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    //发布事件
    public void publishEvent(ApplicationEvent event) {

        applicationContext.publishEvent(event);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}