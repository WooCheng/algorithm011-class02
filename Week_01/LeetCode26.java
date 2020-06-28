package com.alibaba.array;

public class LeetCode26 {



    public static void main(String[] args) {
        LeetCode26 leetCode = new LeetCode26();
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        leetCode.removeDuplicates(nums);

    }

    public int removeDuplicates(int[] nums) {
        int j = 0;//num新数组起始位置
        for (int i = 1; i < nums.length; i++) {
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j;
    }

}


