package com.example.designpattern.structure.proxy.staticproxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 10:53 AM
 */
@Slf4j
public class RealSubject implements Subject {

	private String name = "sam";

	@Override
	public void visit() {
		log.info("{}", name);
	}
}
