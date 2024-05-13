package com.abc.java.executor.cp.problem;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerExample {

    private static final int BUFFER_SIZE = 10;
    private static BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(BUFFER_SIZE);

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2); // One producer, one consumer

        // Submit producer task
        executor.submit(() -> {
            try {
                produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Submit consumer task
        executor.submit(() -> {
            try {
                consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Shutdown the executor service after tasks are completed
        executor.shutdown();
    }

    private static void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            buffer.put(value); // Put value into the buffer (blocking if full)
            System.out.println("Produced: " + value);
            value++;
            Thread.sleep(1000); // Simulate production time
        }
    }

    private static void consume() throws InterruptedException {
        while (true) {
            int value = buffer.take(); // Take value from the buffer (blocking if empty)
            System.out.println("Consumed: " + value);
            Thread.sleep(2000); // Simulate consumption time
        }
    }
}

