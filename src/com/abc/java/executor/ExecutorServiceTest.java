package com.abc.java.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(3);

		CallableTask[] jobs = { new CallableTask("Print"), new CallableTask("Add"), new CallableTask("Sub"),
				new CallableTask("Mult"), new CallableTask("Per"), new CallableTask("Div"), new CallableTask("equal"),
				new CallableTask("Photo") };
		for (CallableTask callableTask : jobs) {
			Future<Integer> f = es.submit(callableTask);
			System.out.println(f.get());
		}
		es.shutdown();

	}

}
