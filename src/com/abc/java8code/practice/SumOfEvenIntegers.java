package com.abc.java8code.practice;

import java.util.stream.IntStream;

public class SumOfEvenIntegers {
	
	public static void main(String[] args) {
        int start = 1; // Starting number
        int end = 1000; // Ending number (adjust this based on your requirement)

        // Calculate sum of even integers using reduce method
        int sumOfEvens = IntStream.rangeClosed(start, end)
                                  .filter(num -> num % 2 == 0) // Filter even numbers
                                  .reduce(0, (acc, num) -> acc + num); // Accumulate sum using lambda expression

        System.out.println("Sum of even integers from " + start + " to " + end + " is: " + sumOfEvens);
    }

}
