package com.company.Stack;

import java.util.LinkedList;

public class StackUsingLinkedList {
     private LinkedList<Integer> list = new LinkedList<>();

    public StackUsingLinkedList(){

    }

    public boolean isEmpty(){
        return(list.isEmpty());
    }
    public int size(){
        return list.size();
    }
    public void push(int ele){
        list.addFirst(ele);
    }

    public  int top(){
        return list.peek();
    }

    public  void Display(){
        System.out.println(list);
    }
    public int pop(){
      int temp=  list.removeLast();
      return temp;
    }

}
