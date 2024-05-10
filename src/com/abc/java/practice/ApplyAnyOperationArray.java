package com.abc.java.practice;

public class ApplyAnyOperationArray {
	
	public static int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
            	nums[i] *= 2;
            	nums[i+1] = 0;
            } 
        }
        int[] result = new int[nums.length];
        int j = 0;
        for(int i=0; i<nums.length; i++){
			if(nums[i] != 0){
				result[j++] = nums[i];
			}
		}
        return result;
    }
	
	public static void main(String[] args) {
		int [] nums = {1,2,2,1,1,0};
		nums = applyOperations(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
	}

}
