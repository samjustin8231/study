package com.example.designpattern.structure.proxy.staticproxy;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 10:55 AM
 */
public class ProxySubject implements Subject {

	private Subject subject;

	public ProxySubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void visit() {
		subject.visit();
	}
}
