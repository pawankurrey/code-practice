package com.abc.java.cp.problem;

import java.util.LinkedList;

public class ConsumerProducerProblem {

	private LinkedList<Integer> queue = new LinkedList<>();
	int campacity = 2;

	int value = 0;

	public void produce() throws InterruptedException {
		while (true) {
			synchronized (this) {

				while (queue.size() == campacity) {
					System.out.println("Producer called wait(), now it is waiting.....");
					wait();
				}
				System.out.println("Producer is now producing the data....");
				queue.add(value++);

				System.out.println("Producer is sending notiifation to the consumer....");
				notify();

				Thread.sleep(5000);
			}
		}
	}
	
	public void consumer() throws InterruptedException {
		while (true) {
			synchronized (this) {

				while (queue.size() == 0) {
					System.out.println("Consumer called wait(), now it is waiting.....");
					wait();
				}
				System.out.println("Consumer is now Consuming the data...." + queue.removeFirst());
				 
				System.out.println("Consumer is sending notiifation to the Producer....");
				notify();

				Thread.sleep(5000);
			}
		}
	}

}

