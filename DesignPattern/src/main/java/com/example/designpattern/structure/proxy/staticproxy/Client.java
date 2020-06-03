package com.example.designpattern.structure.proxy.staticproxy;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 10:55 AM
 */
public class Client {
	public static void main(String[] args) {
		ProxySubject subject = new ProxySubject(new RealSubject());
		subject.visit();
	}
}
