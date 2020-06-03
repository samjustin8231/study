package com.example.designpattern.behavior.state.case1;

/**
 * 类的实现描述：悟空变身的陆地状态类
 *
 * @author sunyajun 2019/2/28 2:04 PM
 */
public class LandState implements State {
	public static final String MONKEY_STATE = "猴子";
	public static final String EARTHWORM_STATE = "蚯蚓";

	private String state;

	/*
	 * 要陆地上的什么动物需要告诉悟空
	 */
	public LandState(String state) {
		this.state = state;
	}

	/*
	 * 变身的方法,由悟空来调用.
	 * 悟空知道要变的类型才可以变身成功
	 */
	@Override
	public void handleState() {
		if (MONKEY_STATE.equals(state)) {
			System.out.println("变 猴子....");
		} else if (EARTHWORM_STATE.equals(state)) {
			System.out.println("变 蚯蚓....");
		} else {
			//如果不符合条件则变身失败.
			System.out.println("变身失败...");
		}
	}
}
