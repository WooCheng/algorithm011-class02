package com.alibaba.array;

public class LowestCommonAncestor {

    public static void main(String[] args) {
        TreeNode node1_1 = new TreeNode(3);
        TreeNode node2_1 = new TreeNode(1);
        TreeNode node2_2 = new TreeNode(7);
        node1_1.left = node2_1;
        node1_1.right = node2_2;

        TreeNode node3_2_1 = new TreeNode(6);
        TreeNode node3_2_2 = new TreeNode(2);
        node2_1.left = node3_2_1;
        node2_1.right = node3_2_2;
        TreeNode treeNode = lowestCommonAncestor(node1_1,node3_2_1,node3_2_2);
        System.out.println(treeNode.val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return root;
        }
        if(root == p || root == q){
            return root;
        }
        TreeNode leftNode = lowestCommonAncestor(root.left,p,q);
        TreeNode rightNode = lowestCommonAncestor(root.right,p,q);
        if (leftNode == null) {
            return rightNode;
        }
        if (rightNode == null) {
            return leftNode;
        }
        return root;
    }

}
