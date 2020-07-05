package com.alibaba.array;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {

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

        List<Integer> result = new PreorderTraversal().preorderTraversal(node1_1);
        ArrayUtils.printArray(result);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        return preorder(root,result);
    }

    /**
     * 中序遍历->中序：根->左->右
     * @param root
     * @param result
     */
    public List<Integer> preorder(TreeNode root, List<Integer> result){
        if(root != null){
            result.add(root.val);
            preorder(root.left,result);
            preorder(root.right,result);
        }
        return result;
    }

}
