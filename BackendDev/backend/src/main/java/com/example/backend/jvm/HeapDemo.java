package com.example.backend.jvm;

import lombok.extern.slf4j.Slf4j;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/5/12 10:44 PM
 */
@Slf4j
public class HeapDemo {
	public static void main(String[] args) {
		byte[] aa = new byte[4 * 1000 * 1000];
		log.info("申请内存:{}", "4m");

		log.info("最大内存：{}m", Runtime.getRuntime().maxMemory() / 1000 / 1000);
		log.info("可用内存：{}m", Runtime.getRuntime().freeMemory() / 1000 / 1000);
		log.info("已经使用内存：{}m", Runtime.getRuntime().totalMemory() / 1000 / 1000);
	}
}
