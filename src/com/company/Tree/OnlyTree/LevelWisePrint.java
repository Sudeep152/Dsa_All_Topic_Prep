//package com.company.Tree.OnlyTree;
//
//import java.util.*;
//
//public class LevelWisePrint {
//    public static void main(String []args){
//
//    TreeNode<Integer> root = takeInput();
//        printTree(root);
//    }
//
//    static  void  printTree( TreeNode root){
//        Queue<TreeNode<Integer>> pendingNote = new PriorityQueue<>();
//       if (root== null)return;
//
//        pendingNote.add(root);
//        while (!pendingNote.isEmpty()){
//            TreeNode<Integer>front = pendingNote.poll();
//            System.out.println(front.data+":");
//
//            for (int i =0; i<front.children.size();i++){
//                TreeNode<Integer> child = front.children.get(i);
//                front.children.add(child);
//                pendingNote.add(child);
//
//            }
//
//
//        }
//
//
//    }
////
//
//    static  TreeNode<Integer> inputLevelWise(){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter root value ");
//        TreeNode<Integer> rootData = sc.nextInt();
//        Queue<TreeNode<Integer>> queue = new LinkedList<>();
//         TreeNode<Integer>  root= new TreeNode<>(rootData);
//         queue.add(root);
//
//
//         while (!queue.isEmpty()){
//             TreeNode<Integer> frontNode = queue.poll();
//             System.out.println("Enter size of children "+frontNode.data);
//             int childSize = sc.nextInt();
//             for (int i =0;i< childSize;i++){
//                 System.out.println("Enter "+ i+ " th " +"Child of "+frontNode.data);
//                 TreeNode<Integer> child = sc.nextInt();
//                 TreeNode<Integer> childNode = new TreeNode<>(child);
//                 frontNode.children.add(childNode);
//                 queue.add(childNode);
//
//             }
//
//
//         }
//         return root;
//
//    }
//
//
//    static TreeNode<Integer> takeInput(){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter root value");
//        TreeNode<Integer> rootData = scanner.nextInt();
//        Queue<TreeNode<Integer>> pendingNode = new LinkedList<>();
//        TreeNode<Integer> root = new TreeNode<>(rootData);
//        pendingNode.add(root);
//
//
//
//        while (!pendingNode.isEmpty()){
//             TreeNode<Integer> front = pendingNode.poll();
//            System.out.println("Enter the size of  children "+front.data );
//            int childSize = scanner.nextInt();
//
//            for (int i =0; i< childSize;i++){
//                System.out.println("Enter the value of "+ (i+1)+" for " +front.data);
//                TreeNode<Integer> childData = scanner.nextInt();
//                TreeNode<Integer>childNode = new TreeNode<>(childData);
//                front.children.add(childNode);
//                pendingNode.add(childNode);
//
//
//
//
//            }
//
//
//
//
//
//
//
//        }
//
//
//
//
//
//        return root;
//
//
//    }
//
//}
