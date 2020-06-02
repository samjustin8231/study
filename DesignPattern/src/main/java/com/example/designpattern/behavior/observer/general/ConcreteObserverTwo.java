package com.example.designpattern.behavior.observer.general;

/**
 * @author sunyajun
 * @date 2020/4/14 4:01 PM
 */
public class ConcreteObserverTwo implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserverTwo is notified.");
    }
}
