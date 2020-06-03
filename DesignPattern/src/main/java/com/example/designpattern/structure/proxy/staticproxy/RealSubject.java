package com.example.designpattern.structure.proxy.staticproxy;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 目标对象
 *
 * @author sunyajun 2019/2/28 10:53 AM
 */
@Slf4j
@Data
public class RealSubject implements Subject {

	private String name = "小明";

	public RealSubject() {
		log.info("=====> new RealSubject");
	}

	public RealSubject(String name) {
		this.name = name;
	}

	@Override
	public void visit() {
		log.info("=====> visit[访问目标对象的方法], name:{}", name);
	}
}
