package com.abc.java.cp.problem;

public class ConsumerProducerProblemTest {

	public static void main(String[] args) {

		System.out.println("Main thread....");
		ConsumerProducerProblem pc = new ConsumerProducerProblem();
		Thread producerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread consumerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		producerThread.start();
		consumerThread.start();

	}

}
