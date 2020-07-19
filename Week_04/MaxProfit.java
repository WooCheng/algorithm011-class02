package com.alibaba.array;

public class MaxProfit {

    public static void main(String[] args) {
        int[] nums = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int income = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if(prices[i] < prices[i+1]){//如果前一天小于后一天买入 加入收益
                income += prices[i+1] - prices[i];
            }
        }
        return income;
    }

}
