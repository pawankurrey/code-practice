package com.abc.java.practice;

import java.util.HashSet;
import java.util.Set;

/**Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

Example 1:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).**/

public class RemoveDuplicateFromArray {
	
	public static int removeDuplicates(int[] arr) {
        int j = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
	
	public static int removeDuplicatesUsingSet(int[] arr) {
		int k = 0;
		Set<Integer> set = null;
		if(arr != null) {
			set = new HashSet<>();
			for (int i = 0; i < arr.length; i++) {
				set.add(arr[i]);
			}
			k = set.size();
		}
		return k;
	}

	public static void main(String[] args) {
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
		System.out.println(removeDuplicatesUsingSet(nums));

	}

}
