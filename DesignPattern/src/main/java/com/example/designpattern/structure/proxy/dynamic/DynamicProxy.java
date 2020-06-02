package com.example.designpattern.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 10:57 AM
 */
public class DynamicProxy implements InvocationHandler {

	private Object object;

	public DynamicProxy(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(object, args);
		return result;
	}
}
