package com.abc.java.practice;

public class LIS {

    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1; // Base case: LIS ending at first element is itself (length 1)
        int maxLength = 1; // Variable to keep track of the maximum length found

        // Compute LIS lengths for each element in the array
        for (int i = 1; i < n; i++) {
            dp[i] = 1; // At least the element itself
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int lisLength = lengthOfLIS(nums);
        System.out.println("Length of Longest Increasing Subsequence: " + lisLength);
    }
}

