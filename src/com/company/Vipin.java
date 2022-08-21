package com.company;

import java.util.*;

public class Vipin {
    public static void main(String[] args) {


        String [] ops = {"1","C"};


        calPoints(ops);



    }


    static int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        int n = ops.length;


        for (int i = 0; i < n; i++) {

            String  temp = ops[i];

            if (temp.equals("D")) {
                int dummy= 2*stack.peek();
                stack.push(dummy);

            } else if (temp.equals("C")) {

                stack.pop();

            } else if (temp.equals("+")) {
                int last1 = stack.peek();
                stack.pop();
                int last2= stack.peek();
                stack.push(last1);
                stack.push(last1+last2);
            } else {
                int num = Integer.parseInt(temp);
                stack.push(num);
            }


        }

        while (!stack.isEmpty()){
            int last= stack.pop();
            sum = sum+last;
        }

        return sum ;
    }
}