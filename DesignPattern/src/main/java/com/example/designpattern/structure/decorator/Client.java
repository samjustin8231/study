package com.example.designpattern.structure.decorator;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 11:09 AM
 */
public class Client {
	public static void main(String[] args) {
		TheGreatestSage sage = new Monkey();
		//第一种写法
		TheGreatestSage bird = new Bird(sage);
		bird.move();

		//第二种写法
		TheGreatestSage fish = new Fish(new Bird(sage));
		fish.move();
	}
}
