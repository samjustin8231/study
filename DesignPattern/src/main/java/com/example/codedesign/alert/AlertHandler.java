package com.example.codedesign.alert;

/**
 * @author sunyajun
 * @date 2020/4/15 10:39 AM
 */
public class AlertHandler {

    protected AlertRule rule;

    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    void check(ApiStatInfo apiStatInfo) {

    }
}
