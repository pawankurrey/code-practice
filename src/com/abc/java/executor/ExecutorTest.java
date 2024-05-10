package com.abc.java.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
	
	public static void main(String[] args) {
		ExecutorService excService = Executors.newFixedThreadPool(3);
		ExecutorJob [] executorJobArraJobs = {new ExecutorJob("Print"), new ExecutorJob("Add"), new ExecutorJob("submit"),
				new ExecutorJob("Multi"), new ExecutorJob("Sub"), new ExecutorJob("Div")};
		for (ExecutorJob executorJob : executorJobArraJobs) {
			excService.submit(executorJob);
		}
		excService.shutdown();
	}

}
