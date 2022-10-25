package com.company.Tree;
import  com.company.Tree.InOrderTraversal.TreeNode;

public class PostOrder {
    public  static  void main(String [] args){

        TreeNode  root = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left = new TreeNode(30);
        root.left.right = new TreeNode(50);


        postOrder(root);
    }

    static  void  postOrder(TreeNode node){
        if (node == null)return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

}
