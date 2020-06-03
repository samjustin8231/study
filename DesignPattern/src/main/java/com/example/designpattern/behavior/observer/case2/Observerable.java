package com.example.designpattern.behavior.observer.case2;

/**
 * 类的实现描述：抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 *
 * @author sunyajun 2019/2/28 11:25 AM
 */
public interface Observerable {
	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObserver();
}
