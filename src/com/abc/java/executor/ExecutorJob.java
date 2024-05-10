package com.abc.java.executor;

public class ExecutorJob implements Runnable {

	String name;

	public ExecutorJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " Job Startred by thread " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(name + " Job Ended by thread " + Thread.currentThread().getName());
	}
}
