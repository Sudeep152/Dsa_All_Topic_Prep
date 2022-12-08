package com.company.Tree.Binary_TREE;

import java.time.temporal.Temporal;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelWiseInput {
    public  static void  main(String [] args){

     TreeNode<Integer> root =    levelTakingInput();

     printLevelWise(root);

    }
     static  TreeNode<Integer>  levelTakingInput(){

         Scanner  sc= new Scanner(System.in);
         System.out.println("Enter root value");
         Queue<TreeNode<Integer>> queue= new LinkedList<>();
        int data =sc.nextInt();
        if (data ==-1){
            return null;
        }
         TreeNode<Integer> root = new TreeNode<>(data);
         queue.add(root);

         while (!queue.isEmpty()){
             TreeNode<Integer> front =queue.poll();
             System.out.println("Enter left root for "+ front.data);
             int left = sc.nextInt();
             if (left!=-1){
                 TreeNode<Integer> child = new TreeNode<>(left);
                 queue.add(child);
                 front.left= child;
             }

             System.out.println("Enter right root for "+ front.data);
             int right = sc.nextInt();
            if (right!=-1){
                TreeNode<Integer> child = new TreeNode<>(right);
                queue.add(child);
                front.right= child;
            }



         }

return root;


     }

     static void printLevelWise(TreeNode<Integer>root){

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        if (root==null)return;
        while (!queue.isEmpty()){
            int levelSize= queue.size();
            for (int i=0;i<levelSize;i++){

                if (queue.peek().left!=null) queue.offer(queue.peek().left);
                if (queue.peek().right!=null) queue.offer(queue.peek().right);

                System.out.print(queue.poll().data +" ");

            }


        }



     }

}
