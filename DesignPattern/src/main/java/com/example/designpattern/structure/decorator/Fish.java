package com.example.designpattern.structure.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 类的实现描述：具体装饰角色，“鱼儿”和“鸟儿”
 *
 * @author sunyajun 2019/2/28 11:07 AM
 */
@Slf4j
public class Fish extends Change {
	public Fish(TheGreatestSage theGreatestSage) {
		super(theGreatestSage);
	}

	@Override
	public void move() {
		super.move();
		log.info("change fish move.");
	}
}
