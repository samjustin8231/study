package com.example.codedesign.alert.refactor.notification;

import com.example.codedesign.alert.refactor.msgsender.MsgSender;

/**
 * @author sunyajun
 * @date 2020/4/15 10:47 AM
 */
public abstract class Notification {
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
