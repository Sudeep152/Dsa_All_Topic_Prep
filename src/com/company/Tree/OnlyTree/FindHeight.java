package com.company.Tree.OnlyTree;

public class FindHeight {
    public  static void  main(String  [] args){
        TreeNode<Integer> root = new TreeNode<Integer>(1);
        TreeNode<Integer> node1 = new TreeNode<Integer>(2);
        TreeNode<Integer> node2 = new TreeNode<Integer>(3);
        TreeNode<Integer>  node3 = new TreeNode<Integer>(4);
        TreeNode<Integer>  node4 = new TreeNode<Integer>(5);
        TreeNode<Integer>  node5 = new TreeNode<Integer>(6);
        TreeNode<Integer>  node6 = new TreeNode<Integer>(16);
        root.children.add(node1);
        root.children.add(node2);
        node2.children.add(node5);
        root.children.add(node3);
        node3.children.add(node4);
       node4.children.add(node6);

        System.out.println(getHeight(root));


    }
     static  int  getHeight(TreeNode<Integer> root){

          if ( root==null) return 0;
          int height =0;

          for (int i = 0; i<root.children.size();i++){

              height =  Math.max(height, getHeight(root.children.get(i)))+1;


          }
          return height;



     }
}
