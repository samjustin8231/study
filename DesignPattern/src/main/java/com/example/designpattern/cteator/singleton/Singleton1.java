package com.example.designpattern.cteator.singleton;

/**
 * 类的实现描述：饿汉式单例
 *
 * @author sunyajun 2019/2/28 11:36 AM
 */
public class Singleton1 {

	/**
	 * 饿汉式单例在类加载初始化时就创建好一个静态的对象供外部使用，除非系统重启，这个对象不会改变，所以本身就是线程安全的。
	 */

	// 私有构造
	private Singleton1() {
	}

	private static Singleton1 single = new Singleton1();

	// 静态工厂方法
	public static Singleton1 getInstance() {
		return single;
	}
}
