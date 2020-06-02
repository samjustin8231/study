package com.example.designpattern.cteator.singleton;

/**
 * 类的实现描述：懒汉式，存在多线程并发问题
 *
 * @author sunyajun 2019/2/28 11:37 AM
 */
public class Singleton2 {
	/**
	 * 该示例虽然用延迟加载方式实现了懒汉式单例，但在多线程环境下会产生多个single对象
	 */

	// 私有构造
	private Singleton2() {
	}

	private static Singleton2 single = null;

	public static Singleton2 getInstance() {
		if (single == null) {
			single = new Singleton2();
		}
		return single;
	}
}
