package com.abc.java.executor;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {

	private String threadName = null;

	public CallableTask(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		System.out
				.println("ThreadName : " + threadName + " Job Startred by thread " + Thread.currentThread().getName());
		try {
			for (int i = 0; i < 10; i++) {
				sum += i;
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("ThreadName : " + threadName + " Job Ended by thread " + Thread.currentThread().getName());

		return sum;
	}

}
