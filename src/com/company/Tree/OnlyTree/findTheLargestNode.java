package com.company.Tree.OnlyTree;

public class findTheLargestNode {
    public static void main(String[] args) {

        TreeNode<Integer> root = new TreeNode<Integer>(1);
        TreeNode<Integer> node1 = new TreeNode<Integer>(2);
        TreeNode<Integer> node2 = new TreeNode<Integer>(3);
        TreeNode<Integer> node3 = new TreeNode<Integer>(4);
        TreeNode<Integer> node4 = new TreeNode<Integer>(5);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node3.children.add(node4);

        System.out.println(largestNode(root));


    }

    static int largestNode(TreeNode<Integer> root) {

        if (root == null) {
            return 0;
        }

        int max = root.data;
        for (int i = 0; i < root.children.size(); i++) {

            max = Math.max(max, largestNode(root.children.get(i)));


        }


        return max;
    }
}
