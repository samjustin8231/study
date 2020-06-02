package com.example.designpattern.behavior.observer.event.jdk;

import lombok.Data;

/**
 * @author sunyajun
 * @date 2020/4/14 4:17 PM
 */
@Data
public class MailTaskFinishListener implements TaskFinishEventListner {

    private String emial;

    public MailTaskFinishListener(String emial) {
        this.emial = emial;
    }

    @Override
    public void onTaskFinish(TaskFinishEvent event) {
        System.out.println("Send Emial to " + emial + " Task:" + event.getSource());
    }
}
