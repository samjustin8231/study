package com.example.backend.generic;

/**
 * 泛型类<br/>
 * Som就是一个泛型类，value的类型是T，而T是参数化的。如果有多个类型参数，使用分号隔开,如<U,V>。
 *
 * @author sunyajun 2019/5/14 2:01 PM
 */
public class Som<T> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * obtainV就是一个泛型方法，返回值前有<V>，可以处理任意类型数组。
	 *
	 * @param arr
	 * @param <V>
	 * @return
	 */
	public static <V> V obtainV(V[] arr) {
		return arr[arr.length / 2];
	}

	public static void main(String[] args) {
		//在使用中指定具体的类型实参。
		Som<String> som = new Som<>();
		som.setValue("Hi");
		//som.setValue(123);编译不通过
		String str = som.getValue();

		//使用泛型方法
		Integer[] arr = {1, 2, 3};
		String[] arrStrs = {"1", "2", "3"};
		int i = obtainV(arr);
		String str1 = obtainV(arrStrs);
	}
}
