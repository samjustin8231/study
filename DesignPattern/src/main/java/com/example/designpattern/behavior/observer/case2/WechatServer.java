package com.example.designpattern.behavior.observer.case2;

import java.util.ArrayList;
import java.util.List;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 11:26 AM
 */
public class WechatServer implements Observerable {

	//注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
	private List<Observer> list;

	private String message;


	public WechatServer() {
		list = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		if (!list.isEmpty()) {
			list.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).update(this.message);
		}
	}

	public void setInfomation(String s) {
		this.message = s;
		System.out.println("微信服务更新消息： " + s);
		//消息更新，通知所有观察者
		notifyObserver();
	}
}
