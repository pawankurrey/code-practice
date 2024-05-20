package com.abc.java.practice;

public class HackathonWinner {
	
	public static String winner(String enric, String bob) {
		
		if(calculateScore(enric) > calculateScore(bob)) {
			return "Enric";
		}else {
			return "Bob";
		}
		
	}

	public static int calculateScore(String problemType) {
		int score = 0;
		for (char c : problemType.toCharArray()) {
			switch (c) {
			case 'E': {
				score += 1;
				break;
			} case 'M': {
				score += 3;
				break;
			} case 'H': {
				score += 5;
				break;
			} 
			default:
				throw new IllegalArgumentException("Unexpected value: " + c);
			}
		}
		return score;
	}
	public static void main(String[] args) {
		
		System.out.println(winner("EHE", "EHH"));
		// TODO Auto-generated method stub

	}

}
