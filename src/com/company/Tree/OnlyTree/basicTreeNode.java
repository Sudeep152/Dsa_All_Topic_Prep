package com.company.Tree.OnlyTree;

import java.util.ArrayList;

public class basicTreeNode<T> {
    T data ;
    ArrayList<basicTreeNode<T>> children ;
    basicTreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}
