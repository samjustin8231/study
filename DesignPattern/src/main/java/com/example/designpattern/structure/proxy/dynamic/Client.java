package com.example.designpattern.structure.proxy.dynamic;

import com.example.designpattern.structure.proxy.staticproxy.RealSubject;
import com.example.designpattern.structure.proxy.staticproxy.Subject;

import java.lang.reflect.Proxy;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 10:58 AM
 */
public class Client {
	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		DynamicProxy proxy = new DynamicProxy(realSubject);
		ClassLoader classLoader = realSubject.getClass().getClassLoader();
		Subject subject = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, proxy);
		subject.visit();
	}
}
