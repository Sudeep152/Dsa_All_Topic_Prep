package com.company.Tree;

public class InOrderTraversal {
    public static void main(String[] args) {


        TreeNode  root = new TreeNode(10);
        root.left=new TreeNode(20);
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(40);
        root.right = new TreeNode(50);

        inOrder(root);

    }

  public static class  TreeNode{
    public     int data;
       public     TreeNode right;
         public TreeNode left;
          public TreeNode(int data){
              this.data = data;
          }


    }


    static  void inOrder(TreeNode node){
        if (node == null)return;

        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);



    }
}



