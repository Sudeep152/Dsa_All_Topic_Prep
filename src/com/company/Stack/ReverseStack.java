package com.company.Stack;

import java.util.Stack;

public class ReverseStack {
    public  static void main(String [] args){

        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        reverse(stack);

    }
    static void  reverse(Stack<Integer> list){

        int n = list.size();
        Stack<Integer>ans = new Stack<>();

        for(int i=0;i<n;i++){
            ans.push(list.peek());
            list.pop();
        }

        System.out.println(ans);

    }
}
