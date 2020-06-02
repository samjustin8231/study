package com.example.designpattern.behavior.observer.register;

/**
 * @author sunyajun
 * @date 2020/4/14 4:04 PM
 */
public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService; // 依赖注入

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
