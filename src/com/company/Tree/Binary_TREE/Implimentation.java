package com.company.Tree.Binary_TREE;

public class Implimentation {

    public static  void main(String  [] args){

       TreeNode<Integer> root = new TreeNode<>(1);
       root.left = new TreeNode<>(2);
       root.right = new TreeNode<>(3);
       root.left.left = new TreeNode<>(4);
       root.right.right = new TreeNode<>(5);

       preO(root);


    }
     static  void preO(TreeNode<Integer> root){
         if ( root== null){
             return;
         }
        System.out.println(root.data);

        preO(root.left);
        preO(root.right);

     }
}
