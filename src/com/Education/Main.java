package com.Education;

public class Main {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[nums[i]]);
        }
     }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
