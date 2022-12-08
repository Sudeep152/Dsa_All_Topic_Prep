package com.company.Tree.OnlyTree;

public class CountLeafNode {
    public  static  void main(String [] args){

        TreeNode<Integer> root = new TreeNode<Integer>(1);
        TreeNode<Integer> node1 = new TreeNode<Integer>(2);
        TreeNode<Integer> node2 = new TreeNode<Integer>(3);
        TreeNode<Integer> node3 = new TreeNode<Integer>(4);
        TreeNode<Integer> node4 = new TreeNode<Integer>(5);
        TreeNode<Integer> node5 = new TreeNode<Integer>(5);

        root.children.add(node1);
        root.children.add(node2);
        node2.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);


     System.out.println(getCountLeafNode(root));


    }
     static int getCountLeafNode(TreeNode<Integer> root){

        int sum =0;
        if ( root == null){
            return 0;
        }
        if ( root.children.size()== 0){
            return 1;
        }
        for (int i =0 ; i<root.children.size();i++){

            sum = sum +getCountLeafNode(root.children.get(i));



        }

        return sum;

     }
}
