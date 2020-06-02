package com.example.designpattern.behavior.state.case1;

/**
 * 类的实现描述：悟空变身的海里状态类
 *
 * @author sunyajun 2019/2/28 2:05 PM
 */
public class SeaState implements State {
	public static final String SHIP_STATE = "小船";
	public static final String FISH_STATE = "鱼儿";

	private String state;

	public SeaState(String state) {
		this.state = state;
	}

	@Override
	public void handleState() {
		if (FISH_STATE.equals(state)) {
			System.out.println("变 鱼儿....");
		} else if (SHIP_STATE.equals(state)) {
			System.out.println("变 小船儿....");
		} else {
			//如果不符合条件则变身失败.
			System.out.println("变身失败...");
		}
	}
}
