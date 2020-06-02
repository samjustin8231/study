package com.example.designpattern.behavior.observer.event.jdk;

import lombok.Data;

/**
 * @author sunyajun
 * @date 2020/4/14 4:17 PM
 */
@Data
public class SmsTaskFinishListener implements TaskFinishEventListner {

    private String sms;

    public SmsTaskFinishListener(String sms) {
        this.sms = sms;
    }

    @Override
    public void onTaskFinish(TaskFinishEvent event) {
        System.out.println("Send Sms to " + sms + " Task:" + event.getSource());
    }
}
