package com.example.backend.thread.concurrent.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/5/2 2:44 PM
 */
public class SemaphoreDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();

		Semaphore semaphore = new Semaphore(3); //配置只能发布3个运行许可证
		for (int i = 0; i < 100; i++) {
			int finalI = i;
			executorService.execute(() -> {
				try {
					semaphore.acquire(3); //获取3个运行许可，如果获取不到会一直等待，使用tryAcquire则不会等待
					Thread.sleep(1000);
					System.out.println(finalI);
					semaphore.release(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
		executorService.shutdown();
	}
}
