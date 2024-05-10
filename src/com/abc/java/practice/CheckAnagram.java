package com.abc.java.practice;

import java.util.Arrays;

public class CheckAnagram {

	public boolean testAnagram(String s1, String s2) {

		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		
		if(char1.length != char2.length)
			return false;
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		return Arrays.equals(char1,char2);
		
//		for (int i = 0; i < char1.length; i++)
//            if (char1[i] != char2[i])
//                return false;
//		
//		return true;

	}

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		String s3 = "Hello";
		String s4 = "helli";
		
		CheckAnagram t = new CheckAnagram();
		System.out.println(t.testAnagram(s1, s2));
		System.out.println(t.testAnagram(s3, s4));

	}

}
