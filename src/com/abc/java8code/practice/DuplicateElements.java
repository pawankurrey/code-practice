package com.abc.java8code.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> set = new HashSet<>();
		myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		//Note distinct() method will work for string only not for integer
		List<Integer> unique = myList.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
		
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        
        List<String> uniqueStrngs = listOfStrings.stream().distinct().collect(Collectors.toList());
         
        System.out.println(uniqueStrngs);
        
        //Frequency
        String inputString = "Java Concept Of The Day";
        String finalInput = inputString.replaceAll("\\s+", "").toLowerCase();
        Map<Character, Long> map = finalInput.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
	}

}
