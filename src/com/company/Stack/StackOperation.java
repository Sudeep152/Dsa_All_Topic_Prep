package com.company.Stack;

import java.util.Stack;
import java.util.stream.StreamSupport;

public class StackOperation {
    public static  void main(String  [] args){

        StackUsingArray stc = new StackUsingArray(3);
        StackUsingLinkedList list = new StackUsingLinkedList();
        System.out.println(list.size());
     list.push(1);
     list.push(2);
    list.Display();
    list.pop();
    list.Display();



    }

}
