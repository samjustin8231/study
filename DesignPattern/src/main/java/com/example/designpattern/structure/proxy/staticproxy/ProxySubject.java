package com.example.designpattern.structure.proxy.staticproxy;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 10:55 AM
 */
@Slf4j
public class ProxySubject implements Subject {

	private Subject subject;

	public ProxySubject(Subject subject) {
		log.info("=====> ProxySubject[创建代理对象], subject:{}", JSON.toJSONString(subject));
		this.subject = subject;
	}

	@Override
	public void visit() {
		log.info("=====> visit[访问单例对象的visit]");
		subject.visit();
	}
}
