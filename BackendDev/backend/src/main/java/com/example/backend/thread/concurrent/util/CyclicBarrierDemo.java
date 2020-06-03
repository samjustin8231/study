package com.example.backend.thread.concurrent.util;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 类的实现描述：CyclicBarrierDemo
 *
 * @author sunyajun 2019/5/2 8:43 PM
 */
public class CyclicBarrierDemo {
	private static CyclicBarrier cyclicBarrier = new CyclicBarrier(5, () -> {
		System.out.println("ready done callback!");
	});

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			int finalI = i;
			Thread.sleep(1000);
			executorService.execute(() -> {
				try {
					System.out.println(finalI + "ready!");
					cyclicBarrier.await();
//                    cyclicBarrier.await(2000, TimeUnit.MILLISECONDS); // 如果某个线程等待超过2秒就报错
					System.out.println(finalI + "go!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			});

		}
	}
}
