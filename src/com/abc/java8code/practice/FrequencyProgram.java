package com.abc.java8code.practice;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyProgram {

	public static void main(String[] args) {
		String str = "Welcome to Code Decoe";
		// Remove spaces and convert string to lowercase for case-insensitive counting
		String finalword = str.replaceAll("\\s+", "").toLowerCase();
		
		// Using Java 8 Stream API and Collectors to count frequency of each character
		Map<Character, Long> freqMap  = finalword.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		// Displaying the frequency map
        System.out.println("Character Frequency:");
        freqMap.forEach((character, frequency) ->
                System.out.println("'" + character + "' : " + frequency));
		
	}

}
