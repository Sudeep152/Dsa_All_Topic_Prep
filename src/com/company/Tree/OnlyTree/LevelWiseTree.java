package com.company.Tree.OnlyTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelWiseTree {
    public static  void main(String [] args){

        basicTreeNode<Integer>tree = levelWiseInput();
        printTree(tree);


    }
    static basicTreeNode<Integer> levelWiseInput(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = sc.nextInt();
        Queue<basicTreeNode<Integer>> pendingList = new LinkedList<>();
        basicTreeNode<Integer> root = new basicTreeNode<>(rootData);
        pendingList.add(root);
        while (!pendingList.isEmpty()){
            basicTreeNode<Integer> frontNote =pendingList.remove();
            System.out.println("Enter "+"number of child "+frontNote.data);
           int childNumber = sc.nextInt();
           for (int i =0 ; i< childNumber;i++){
               System.out.println("Enter"+i+1+"th"+"child of "+frontNote.data);
               int child =sc.nextInt();
               basicTreeNode<Integer> childNode = new basicTreeNode<>(child);
               frontNote.children.add(childNode);
               pendingList.offer(childNode);
           }

        }


        return root;


    }

    static void  printTree(basicTreeNode<Integer> node){

        String s = node.data +":";
        for (int i =0; i<node.children.size();i++){
            s= s + node.children.get(i).data +",";

        }
        System.out.println(s);
        for (int i =0; i<node.children.size();i++){
            printTree(node.children.get(i));
        }


    }
}
