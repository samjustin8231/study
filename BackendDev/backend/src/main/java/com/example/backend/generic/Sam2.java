package com.example.backend.generic;

/**
 * 当上界是泛型类或者接口的时候，上界也需要类型参数
 *
 * @author sunyajun 2019/5/14 2:10 PM
 */
public class Sam2<T extends Comparable<T>> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
