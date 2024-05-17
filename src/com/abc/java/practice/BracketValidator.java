package com.abc.java.practice;

import java.util.Stack;

public class BracketValidator {

	public static boolean isValidBrackets(String input) {
		if (input == null) {
			return false;
		}
		Stack<Character> charStack = new Stack<>();
		for (char c : input.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				charStack.push(c);
			} else if (c == ')' || c == ']' || c == '}') {
				return isMatchingPair(charStack.pop(), c);
			}
		}
		return charStack.isEmpty();
	}

	private static boolean isMatchingPair(char opening, char closing) {
		return (opening == '(' && closing == ')') || (opening == '[' && closing == ']')
				|| (opening == '{' && closing == '}');
	}

	public static void main(String[] args) {
		String input1 = "{[()]}";
		String input2 = "{[(])}";

		System.out.println(isValidBrackets(input1)); // Output: true
		System.out.println(isValidBrackets(input2)); // Output: false
	}

}
