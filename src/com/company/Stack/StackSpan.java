package com.company.Stack;

import java.util.Stack;

public class StackSpan {
    public static void main(String  [] args){

   int [ ] arr = {6,2,5,4,5,1,6};

  spanAdv(arr) ;

    }
    static void  spanAdv(int [] arr){
        int n = arr.length;
        int  [] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        ans[0]  =1;

        for (int i =1;i<n;i++){

            while (stack.size() > 0 && arr[i] > arr[stack.peek()] ){
                stack.pop();
            }
            if(stack.size() ==0){
                ans[i]= i+1;
            }else {
                ans[i] = i-stack.peek();
            }

            stack.push(i);


        }

        for (int a =0;a<n;a++){
            System.out.print(ans[a] + " ");
        }






    }
}
