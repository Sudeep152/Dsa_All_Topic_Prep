package com.company.Tree;

public class Implimentation {
    public static void main(String[] args){


        Node root = new Node(5);
         root.left = new Node(10);
         root.right = new Node(15);
         root.left.left = new Node(20);

    }

    static class  Node{

        int key ;
        Node  left;
        Node right;
        Node(int K){
            key=K;
        }

    }

}
