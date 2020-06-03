package com.example.backend.generic;

/**
 * 这样使用Som类，类型参数只接受Number及其子类。
 *
 * @author sunyajun 2019/5/14 2:09 PM
 */
public class Sam<T extends Number> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
