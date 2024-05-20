package com.abc.java8code.practice;

import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {
	
	public static void main(String[] args) {
		String input = "Hello World";
		
		String reversed = input.chars().mapToObj(c -> (char) c).collect(Collectors.collectingAndThen(Collectors.toList(), 
				list ->{ Collections.reverse(list);
					return list.stream();
				})).map(String::valueOf)
        .collect(Collectors.joining());
		System.out.println(reversed);
	}

}
