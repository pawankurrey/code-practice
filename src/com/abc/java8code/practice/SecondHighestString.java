package com.abc.java8code.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighestString {
	
	public static void main(String[] args) {
		String input = "I am good programmer";
		List<String> words = Arrays.asList(input.split(" "));
		Optional<String> secondHighest = words.stream().distinct().sorted((s1, s2) -> s2.compareTo(s1)).skip(1).findFirst();
		System.out.println(secondHighest.get());
	}

}
