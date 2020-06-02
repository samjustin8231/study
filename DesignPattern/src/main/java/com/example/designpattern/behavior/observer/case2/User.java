package com.example.designpattern.behavior.observer.case2;

import lombok.extern.slf4j.Slf4j;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 11:29 AM
 */
@Slf4j
public class User implements Observer {

	private String name;
	private String message;

	public User(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		this.message = message;
		log.info(name + " 收到推送消息： " + message);
	}
}
