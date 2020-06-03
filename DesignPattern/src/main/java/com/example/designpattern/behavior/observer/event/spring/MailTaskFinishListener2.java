package com.example.designpattern.behavior.observer.event.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author sunyajun
 * @date 2020/4/14 4:25 PM
 */
@Component
public class MailTaskFinishListener2 implements ApplicationListener<TaskFinishEvent2> {

    private String emial = "takumiCX@163.com";


    @Override
    public void onApplicationEvent(TaskFinishEvent2 event) {
        System.out.println("Send Emial to " + emial + " Task:" + event.getSource());

    }
}
