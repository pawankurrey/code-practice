package com.abc.java8code.practice;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		// findFirst()
		myList.stream().findFirst().ifPresent(System.out::println);
		// findFirst()
		long count = myList.stream().count();
		System.out.println("Count : " + count);
		// find max
		long max = myList.stream().max(Integer::compare).get();
		System.out.println("Max : " + max);
		
		// find max
		long min = myList.stream().min(Integer::compare).get();
		System.out.println("Min : " + min);
	}

}
