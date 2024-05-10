package com.abc.java8code.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32,49);

		List<Integer> evenNumList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		evenNumList.forEach(System.out::println);

	}

}
