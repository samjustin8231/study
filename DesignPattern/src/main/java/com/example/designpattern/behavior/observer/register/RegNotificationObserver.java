package com.example.designpattern.behavior.observer.register;

/**
 * @author sunyajun
 * @date 2020/4/14 4:04 PM
 */
public class RegNotificationObserver implements RegObserver {
    private NotificationService notificationService;

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}
