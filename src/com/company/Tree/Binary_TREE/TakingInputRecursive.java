package com.company.Tree.Binary_TREE;

import java.util.Scanner;

public class TakingInputRecursive {
    public  static void main(String [] args){

         Scanner sc= new Scanner(System.in);
         TreeNode<Integer> root=takingInput(sc);

         printTree(root);
    }

    static  void printTree(TreeNode<Integer> root){

        if ( root==null) return;
        String answer =  root.data + ":";


        if (root.left!=null){
            answer=answer+ "L" +root.left.data+ " ,";
        }
        if (root.right!=null){
            answer="R " +answer+ root.right.data+ " ,";
        }
        System.out.println(answer);
        printTree(root.left);
        printTree(root.right);




    }
    static  TreeNode<Integer> takingInput(Scanner sc){

        System.out.println("Enter the root ");
        int data= sc.nextInt();
        TreeNode<Integer> root= new TreeNode<>(data);
        if (data==-1){
            return null;
        }
        root.left = takingInput(sc);
        root.right= takingInput(sc);

        return root;
    }

}
