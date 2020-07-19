package com.alibaba.array;

public class LemonadeChange {

    public static void main(String[] args) {
        int[] nums = new int[]{5,5,5,10,20};
        System.out.println(lemonadeChange(nums));
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0;int ten = 0;//初始状态5元0张  10元0张
        for (int i = 0; i < bills.length; i++) {
            if(bills[i] == 5){//如果是5元收入five加一张
                five++;
            }else if (bills[i] == 10){//如果10元收入10元加1找零5元减1
                if(five < 0){
                    return false;
                }
                five--;
                ten++;
            }else {
                if(five >= 1 && ten >= 1){//优先使用一张5元 1张10元
                    ten -= 1;
                    five -= 1;
                }else if(five >= 3){
                    five -= 3;
                }else {
                    return false;
                }
            }
        }
        if(ten >= 0 && five >= 0){
            return true;
        }
        return false;
    }

}
