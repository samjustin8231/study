package com.example.designpattern.structure.proxy.dynamic;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理，实现InvocationHandler
 *
 * @author sunyajun 2019/2/28 10:57 AM
 */
@Slf4j
public class DynamicProxy implements InvocationHandler {

	private Object object;

	public DynamicProxy(Object object) {
		log.info("=====> new DynamicProxy, object:{}", object);
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		log.info("=====> invoke[访问代理对象方法]");
		log.info("=====> invoke[前置通知]");
		Object result = method.invoke(object, args);
		log.info("=====> invoke[后置通知]");
		return result;
	}
}
