package com.abc.java8code.practice;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
	//Write a program to list the number start with “1” from given input.
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 10, 19);
		myList.stream().filter(n -> (n + "").startsWith("1")).distinct().sorted().forEach(System.out::println);
	}

}
