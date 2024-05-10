package com.abc.java8code.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateWords {
	
	public static void main(String[] args) {
		String str = "Welcome to code decode and code decode welcome to you";
		
		List<String> strList = Arrays.asList(str.split(" "));
		Map<String, Long> map = strList.stream().map(strs -> strs.toLowerCase()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}

}
