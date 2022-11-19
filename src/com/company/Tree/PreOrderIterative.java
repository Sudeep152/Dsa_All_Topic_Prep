package com.company.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import  com.company.Tree.Revison.TreeNode;

public class PreOrderIterative {
    public static void main(String [] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left= new TreeNode(3);
        root.left.right  = new TreeNode(4);
        root.left.right.left = new TreeNode(5);
        root.left.right.right=new TreeNode(6);



        List<Integer> lsit =   preOrder(root);
        System.out.println(lsit);


    }
    static List<Integer> preOrder(Revison.TreeNode root){

        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null)return answer ;
        stack.push(root);
        while(!stack.isEmpty()) {

            if (root.right != null) {
                stack.push(root.right);
            }

            if (root.left != null) {
                stack.push(root.left);
            }
            root = stack.pop();

            if(root.left==null  || root.right ==null){

                if (root.right != null) {
                    stack.push(root.right);
                }

                if (root.left != null) {
                    stack.push(root.left);
                }

                answer.add(root.data);
            }



        }



            return answer;

    }


}
