package com.company.Tree.BinaryTree;

import java.util.*;

public class Revison {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here


        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left= new TreeNode(40);
        root.left.right  = new TreeNode(50);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);


       List< List<Integer>> ans= levelOrder(root);
        System.out.println(ans);




    }
    static List<List<Integer>>  levelOrder(TreeNode root){

        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root== null)return answer;
        qu.offer(root);
        while(!qu.isEmpty()){

            List<Integer> sublist = new ArrayList<>();
            int size = qu.size();
            for(int i =0;i<size;i++){

                if(qu.peek().left!=null) qu.offer(qu.peek().left);
                if(qu.peek().right!=null)qu.offer(qu.peek().right);
                sublist.add(qu.poll().data);


            }

            answer.add(sublist);





        }

        return answer;

    }




    static class TreeNode{

        int data;
        TreeNode right ;
        TreeNode left;
        TreeNode(int data){
            this.data = data;

        }


    }


}
