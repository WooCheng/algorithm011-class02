package com.alibaba.array;

import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        IsAnagram isAnagram = new IsAnagram();
        IsAnagram.isAnagram2(s,t);
    }

    public boolean isAnagram(String s, String t){
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        return String.valueOf(sarr).equalsIgnoreCase(String.valueOf(sarr));
    }

    public static boolean isAnagram2(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] counter = new int[26];//使用数组进行散列映射
        for (int i = 0;i < s.length();i++){
            counter[s.charAt(i) - 'a'] ++;//字符串1进行加计数
            counter[t.charAt(i) - 'a'] --;//字符串2进行减计数
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0){//当有一个位置不为0则不相等
                return false;
            }
        }
        return true;
    }

}
