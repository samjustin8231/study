package com.example.designpattern.behavior.observer.case2;

/**
 * 类的实现描述：抽象观察者
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 *
 * @author sunyajun 2019/2/28 11:25 AM
 */
public interface Observer {
	void update(String message);
}
