package com.company.Tree.BinaryTree;
import com.company.Tree.BinaryTree.Revison.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderIterative {
    public  static void main(String [] args){


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.left= new TreeNode(5);
        root.left.right.right= new TreeNode(6);

        List<Integer>  ans= postOrder(root);


        System.out.println(ans);


    }

    static List<Integer> postOrder(TreeNode root){
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode>stack1 = new Stack<>() ;
        Stack<TreeNode> stack2 = new Stack<>();

        if (root==null) return answer;
        stack1.push(root);
        while (!stack1.isEmpty()){
            root = stack1.pop();
            stack2.push(root);
            if (root.left!=null){
                stack1.push(root.left);
            }
            if(root.right!=null){
                stack1.push(root.right);
            }

        }
        while (!stack2.isEmpty()){
            answer.add(stack2.pop().data);


        }



        return answer;
    }


}
