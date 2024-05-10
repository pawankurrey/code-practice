package com.abc.java8code.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of integers, separate odd and even numbers?
public class FindOddAndEven {
	
	public static void main(String[] args) {
		
		 List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		 Map<Boolean, List<Integer>> oddEvenNumbersMap = listOfIntegers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		 System.out.println("Even Number");
		 oddEvenNumbersMap.get(true).stream().forEach(e -> System.out.println(e));
		 System.out.println("Odd Number");
		 oddEvenNumbersMap.get(false).stream().forEach(e -> System.out.println(e));
	}

}
