package com.abc.java.practice;

/**
 Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
 */
public class MaximumSubarray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int n = nums.length;
		int max = Integer.MIN_VALUE, sum = 0;

		for (int i = 0; i < n; i++) {
			sum += nums[i];
			max = Math.max(sum, max);
//			System.out.println(max);
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println(max);
	}

}
