package com.example.designpattern.structure.decorator;

/**
 * 类的实现描述：抽象装饰角色“七十二变”
 *
 * @author sunyajun 2019/2/28 11:07 AM
 */
public class Change implements TheGreatestSage {

	private TheGreatestSage theGreatestSage;

	public Change(TheGreatestSage theGreatestSage) {
		this.theGreatestSage = theGreatestSage;
	}

	@Override
	public void move() {
		theGreatestSage.move();
	}
}
