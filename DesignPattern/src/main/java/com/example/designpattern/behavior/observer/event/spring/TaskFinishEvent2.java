package com.example.designpattern.behavior.observer.event.spring;

import org.springframework.context.ApplicationEvent;

public class TaskFinishEvent2 extends ApplicationEvent {
    public TaskFinishEvent2(Object source) {
        super(source);
    }
}
