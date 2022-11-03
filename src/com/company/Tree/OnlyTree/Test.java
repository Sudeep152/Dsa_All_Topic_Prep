package com.company.Tree.OnlyTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String [] args){

        TreeNode root= takingInput();
        printTree(root);

    }

    static class TreeNode<T>{

        T data ;
        ArrayList<TreeNode<T>> childern ;
        TreeNode(T data){
            this.data = data;
        }


    }
    static TreeNode<Integer> takingInput(){
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter next value");
        n=sc.nextInt();
        TreeNode<Integer> root  = new TreeNode<>(n);
        System.out.println("Enter number of childern "+ n);
        int childCount = sc.nextInt();
        for (int i =0;i<childCount ;i++ ){
            TreeNode<Integer> child = takingInput();
            root.childern.add(child);
        }
        return root;
    }
    static  void printTree(TreeNode<Integer> root){

        String ans = root.data + ":";
        for(int i =0; i<root.childern.size() ;i++){
            ans = root.childern.get(i).data +",";
        }
        System.out.println(ans);
        for(int  i =0 ;i< root.childern.size();i++){
            printTree(root.childern.get(i));
        }


    }

}
