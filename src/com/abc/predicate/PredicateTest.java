package com.abc.predicate;

import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		Predicate<String> predicate = s -> s.length()>5;
		
		System.out.println("Predicate test result : "+predicate.test("Welcome to java 8"));
	}

}
