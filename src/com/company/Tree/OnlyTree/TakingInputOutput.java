package com.company.Tree.OnlyTree;

import java.util.Scanner;

public class TakingInputOutput {
    public static void main(String[] args) {

        basicTreeNode root = takingInput(new Scanner(System.in));
 printTree(root);

    }

    static basicTreeNode<Integer> takingInput(Scanner sc) {
        int n;
        System.out.println("Enter next node");
        n = sc.nextInt();
        basicTreeNode<Integer> root = new basicTreeNode<Integer>(n);
        System.out.println("Enter number of child for " + n);
        int childcount = sc.nextInt();
        for (int i = 0; i < childcount; i++) {
            basicTreeNode<Integer> child = takingInput(sc);
            root.children.add(child);
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
