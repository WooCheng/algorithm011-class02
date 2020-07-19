package com.alibaba.array;

public class Search {

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};//0,1,2,4,5,6,7
        int target = 1;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left < right){
            mid = (right + left) / 2;
            if(nums[mid] == target){
                index = mid;
            }
            if (nums[mid] < nums[right]) {
                if(target > nums[mid] && target <= nums[right]){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }else {
                if(target < nums[mid] && target >= nums[left]){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }
        }
        return index;
    }

}
