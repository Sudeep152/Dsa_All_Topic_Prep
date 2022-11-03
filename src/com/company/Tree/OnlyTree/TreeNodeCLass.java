package com.company.Tree.OnlyTree;

public class TreeNodeCLass {
    public static void main(String[] args) {
        basicTreeNode Tree = new basicTreeNode(10);
        basicTreeNode node1 = new basicTreeNode(20);
        basicTreeNode node2 = new basicTreeNode(30);
        basicTreeNode node3 = new basicTreeNode(40);
        basicTreeNode node4 = new basicTreeNode(50);
        node1.children.add(node4);
        Tree.children.add(node1);
        Tree.children.add(node2);
        Tree.children.add(node3);
        System.out.println(Tree);


    }


}
