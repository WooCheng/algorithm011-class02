package com.alibaba.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Combine {

    private static List<List<Integer>> result = new ArrayList<List<Integer>>();

    public static void main(String[] args) {
        combine(4,2);
    }

    public static List<List<Integer>> combine(int n, int k) {
        backtrack(new Stack<Integer>(),n,k,1);
        return result;
    }

    public static void backtrack(Stack<Integer> stack, int n, int k, int begin) {
        if(stack.size() == k){
            result.add(new ArrayList<Integer>(stack));
            return;
        }
        for (int i = 1;i <= n - (k - stack.size()) + 1 ;i++) {
            stack.add(i);
            backtrack(stack,n,k,i+1);
            stack.pop();
        }
    }

}
