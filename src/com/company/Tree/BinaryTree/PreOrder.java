package com.company.Tree.BinaryTree;

import java.util.ArrayList;

public class PreOrder {
    public static  void main(String []args ){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);

      ArrayList<Integer> myTree= new ArrayList<>();
      preOrderPrint(root,myTree);
      System.out.println(myTree);




    }
   static class Node {
        int data ;
        Node right;
        Node left ;
        Node(int key){
            data=key;
        }

        ///Root Left Right

   }
    static void preOrderPrint(Node node, ArrayList<Integer> list ){
        if (node ==null){
            return;
        }
        list.add(node.data);
        preOrderPrint(node.left,list);
        preOrderPrint(node.right,list);

    }
}
