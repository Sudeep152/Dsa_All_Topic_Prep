package com.company.Tree.OnlyTree;

import java.util.ArrayList;

public class TreeNode<T> {
    public int data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}
