package com.example.designpattern.behavior.state.case1;

/**
 * 类的实现描述：悟空变身的天空状态类
 *
 * @author sunyajun 2019/2/28 2:05 PM
 */
public class SpaceState implements State {
	public static final String BIRD_STATE = "鸟";
	public static final String AIRPLANE_STATE = "飞机";

	private String state;

	public SpaceState(String state) {
		this.state = state;
	}

	@Override
	public void handleState() {
		if (BIRD_STATE.equals(state)) {
			System.out.println("变 小鸟....");
		} else if (AIRPLANE_STATE.equals(state)) {
			System.out.println("变 飞机....");
		} else {
			//如果不符合条件则变身失败.
			System.out.println("变身失败...");
		}
	}
}

