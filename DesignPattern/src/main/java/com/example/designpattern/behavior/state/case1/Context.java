package com.example.designpattern.behavior.state.case1;

/**
 * 类的实现描述：这个Context类相当于 悟空
 *
 * @author sunyajun 2019/2/28 2:06 PM
 */
public class Context {
	private State state;

	/**
	 * 悟空会根据你不同的状态而做不同的处理,
	 * 而处理的东西都可以在实现类里完成,如在变小船状态时做什么.
	 * 这样就便于拓展了.
	 *
	 * @param state
	 */
	public void setState(State state) {
		this.state = state;
		System.out.println("悟空准备开始变身..");

		//悟空可以调用该变身方法
		state.handleState();
	}
}
