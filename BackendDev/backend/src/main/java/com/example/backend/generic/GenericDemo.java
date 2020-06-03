package com.example.backend.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/5/14 1:42 PM
 */
public class GenericDemo {

	public static void main(String[] args) {
		/**
		 * List ，List<?> 与 List<Object> 有区别吗？
		 */
		case1();

		case2();


	}

	private static void case2() {
		//2.List<?> 是一个泛型，在没有赋值之前，是可以接受任何集合的赋值的，我想这点大家都知道，但是请注意，赋值之后就不能往里面添加元素了
		List<Object> t1 = new ArrayList<>();
		List<?> t2 = t1;
		// 编译通过
		t2.remove(0);
		t2.clear();
		// 编译不通过
//		t2.add(new Object());
	}

	private static void case1() {
		//1.我们先来看看 List 与 List<Object>
		List<Integer> t1 = new ArrayList<>();
		// 编译通过
		List t2 = t1;
		//编译失败
//		List<Object> t3 = t1;
	}
}
