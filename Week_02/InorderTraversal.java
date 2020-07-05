package com.alibaba.array;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode node1_1 = new TreeNode(1);

        TreeNode node2_1 = new TreeNode(4);
        TreeNode node2_2 = new TreeNode(5);

        node1_1.left = node2_1;
        node1_1.right = node2_2;

        TreeNode node3_1 = new TreeNode(3);
        TreeNode node3_2 = new TreeNode(2);

        node2_1.left = node3_1;
        node2_1.right = node3_2;

        List<Integer> result = new InorderTraversal().inorderTraversal(node1_1);
        ArrayUtils.printArray(result);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        return inorder(root,result);
    }

    /**
     * 中序遍历->中序：左->根->右
     * @param root
     * @param result
     */
    public List<Integer> inorder(TreeNode root,List<Integer> result){
        if(root != null){
            inorder(root.left,result);
            result.add(root.val);
            inorder(root.right,result);
        }
        return result;
    }


}
