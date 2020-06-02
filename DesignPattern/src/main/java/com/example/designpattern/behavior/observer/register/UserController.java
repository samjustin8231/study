package com.example.designpattern.behavior.observer.register;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunyajun
 * @date 2020/4/14 4:06 PM
 */
public class UserController {

    private UserService userService; // 依赖注入
    private List<RegObserver> regObservers = new ArrayList<>();

    public void setRegObservers(List<RegObserver> observers) {
        regObservers.addAll(observers);
    }

    public Long register(String telephone, String password) {
        long userId = userService.register(telephone, password);

        for (RegObserver observer : regObservers) {
            observer.handleRegSuccess(userId);
        }
        return userId;
    }
}
