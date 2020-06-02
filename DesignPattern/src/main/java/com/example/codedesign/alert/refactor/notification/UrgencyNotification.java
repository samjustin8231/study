package com.example.codedesign.alert.refactor.notification;

import com.example.codedesign.alert.refactor.msgsender.MsgSender;

/**
 * 严重警报通知
 *
 * @author sunyajun
 * @date 2020/4/15 10:47 AM
 */
public class UrgencyNotification extends Notification {
    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}