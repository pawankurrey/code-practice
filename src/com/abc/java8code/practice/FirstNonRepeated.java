package com.abc.java8code.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a String, find the first non-repeated character in it using Stream functions?
public class FirstNonRepeated {
	
	public static void main(String[] args) {
		String input = "Java articles are Awesome";
		Character result = input.toLowerCase().chars() // Stream of String       
	            .mapToObj(s -> (char) s) // First convert to Character object       
	            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
	            .entrySet()
	            .stream()
	            .filter(entry -> entry.getValue() == 1L)
	            .map(entry -> entry.getKey())
	            .findFirst()
	            .get();
	    System.out.println(result);  
	    
	    List<String> list = new ArrayList<>(Arrays.asList("Foo", "Bar", "Bar", "Bar", "Foo"));
	    Map<String, Long> results = list.stream()
	    		  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	    System.out.println(results);
		
	    List<String> list1 = new ArrayList<>(Arrays.asList("Adam", "Bill", "Jack", "Joe", "Ian"));
	    Map<Integer, Long> result1 = list1.stream()
	    		  .collect(Collectors.groupingByConcurrent(String::length, Collectors.counting()));
	    System.out.println(result1);
	}

}
