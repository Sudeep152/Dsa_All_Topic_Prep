package com.company.Tree.OnlyTree;

public class DepthOfNode {
public static  void main(String[] args){



 TreeNode<Integer> root = new TreeNode<Integer>(1);
 TreeNode<Integer> node1 = new TreeNode<Integer>(2);
 TreeNode<Integer> node2 = new TreeNode<Integer>(3);
 TreeNode<Integer>  node3 = new TreeNode<Integer>(4);
 TreeNode<Integer>  node4 = new TreeNode<Integer>(5);
 root.children.add(node1);
 root.children.add(node2);
 root.children.add(node3);
 node3.children.add(node4);

 getDepthOfNode(root,2);

}
 static void   getDepthOfNode(TreeNode<Integer> root ,int k){


    if ( k<0){
     return;
    }
    if (k==0){
     System.out.println(root.data);
    }
    for (int i =0;i<root.children.size();i++){
     getDepthOfNode(root.children.get(i),k-1);
    }






 }

}
