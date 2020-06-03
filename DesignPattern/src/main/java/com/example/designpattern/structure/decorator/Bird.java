package com.example.designpattern.structure.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 11:08 AM
 */
@Slf4j
public class Bird extends Change {
	public Bird(TheGreatestSage theGreatestSage) {
		super(theGreatestSage);
	}

	@Override
	public void move() {
		super.move();
		log.info("change bird move.");
	}
}
