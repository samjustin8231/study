package com.example.designpattern.behavior.observer.case2;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 11:30 AM
 */
public class Client {
	public static void main(String[] args) {
		WechatServer server = new WechatServer();

		Observer userZhang = new User("ZhangSan");
		Observer userLi = new User("LiSi");
		Observer userWang = new User("WangWu");

		server.registerObserver(userZhang);
		server.registerObserver(userLi);
		server.registerObserver(userWang);
		server.setInfomation("PHP是世界上最好用的语言！");

		System.out.println("----------------------------------------------");
		server.removeObserver(userZhang);
		server.setInfomation("JAVA是世界上最好用的语言！");
	}
}
