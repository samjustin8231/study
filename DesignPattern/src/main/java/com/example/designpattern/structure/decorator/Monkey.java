package com.example.designpattern.structure.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 类的实现描述：具体构件角色“大圣本尊”，猢狲类
 *
 * @author sunyajun 2019/2/28 11:06 AM
 */
@Slf4j
public class Monkey implements TheGreatestSage {
	@Override
	public void move() {
		log.info("monkey move.");
	}
}
