package com.company.Tree.OnlyTree;

import java.util.Scanner;

public class TakingInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeNode<Integer> root =  takingInput(scanner);
       printTree(root);


    }



   static TreeNode  takingInput(Scanner sc){

        int n;
        System.out.println("Enter root element");

        n = sc.nextInt();
        TreeNode<Integer>  root=  new TreeNode<>(n);
        int childNo ;
        System.out.println("Enter children number for " + n);
        childNo = sc.nextInt();
        for (int i =0;i<childNo;i++){
           TreeNode<Integer> children=  takingInput(sc);
            root.children.add(children);
        }



        return root;

    }

    static void  printTree(TreeNode<Integer> root){

        String ans = root.data+ " :";
        for (int i =0;i<root.children.size();i++){
            ans =ans+ root.children.get(i).data +",";
        }
        System.out.println(ans);
        for (int i =0;i<root.children.size();i++){
            printTree(root.children.get(i));
        }




    }
}
