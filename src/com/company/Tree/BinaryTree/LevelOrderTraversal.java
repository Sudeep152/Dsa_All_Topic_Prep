package com.company.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public  static void main(String  [] args){

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left  = new TreeNode(60);




        List<List<Integer>> lis= levelOrder(root);
        System.out.println(lis);

    }
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data= data;
        }
    }

    static List<List<Integer>> levelOrder (TreeNode root){

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>>  answer = new ArrayList<>();
        if(root ==null) return  answer;
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSIze = queue.size();
            List<Integer> sublist = new LinkedList<>();
           for (int i =0; i < levelSIze;i++){
               if (queue.peek().left!=null) queue.offer(queue.peek().left);
               if (queue.peek().right!=null) queue.offer(queue.peek().right);
               sublist.add(queue.poll().data);

           }
            answer.add(sublist);
        }


        return answer;

    }
}
