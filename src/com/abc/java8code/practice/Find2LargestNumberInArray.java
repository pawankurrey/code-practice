package com.abc.java8code.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find2LargestNumberInArray {
	
	public static void find2LargestNumberInArray(List<Integer> intList) {
		if(intList != null) {
			List<Integer> sortedList = intList.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(sortedList.get(sortedList.size()-2));
		}
	}
	
	public static void main(String[] args) {
		find2LargestNumberInArray(Arrays.asList(45,34,67,97,88,45,100));
	}

}
