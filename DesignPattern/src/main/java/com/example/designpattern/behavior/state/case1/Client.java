package com.example.designpattern.behavior.state.case1;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 2:06 PM
 */
public class Client {
	public static void main(String[] args) {
		//Context 悟空类
		Context context = new Context();

		//陆地状态切换
		//告诉悟空你想让他变成陆地上的蚯蚓.
		LandState landState = new LandState(LandState.EARTHWORM_STATE);
		//悟空得到需求准备变身..

		context.setState(landState);

		//水里状态切换
		SeaState seaState = new SeaState(SeaState.SHIP_STATE);
		context.setState(seaState);

		//空中状态切换
		//此时我想让悟空变成空中的小船,因此会变身失败.信息来源不对
		SpaceState spaceState = new SpaceState(SeaState.SHIP_STATE);
		context.setState(spaceState);
	}
}
