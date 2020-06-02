package com.example.designpattern.behavior.observer.general;

/**
 * @author sunyajun
 * @date 2020/4/14 4:01 PM
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers(new Message());
    }
}
