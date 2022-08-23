package com.company.Stack;

import java.util.Stack;

public class NextRightSmallElementIndex {
    public static  void main(String [] args){

        int  [] arr= {1,1};
        solution(arr);

    }
    static void solution (int [] arr ){
        int n= arr.length;
        int [] rNseI = new int[n];
        Stack<Integer> stackIndex= new Stack<>();
        stackIndex.push(n-1);
        rNseI[n-1]=n;
        for (int i = n-2;i>=0;i--){
            while (stackIndex.size()> 0  && arr[i] < arr[stackIndex.peek()] ){
                stackIndex.pop();
            }
            if(stackIndex.isEmpty()){
                rNseI[i] = arr.length;
            }else {
                rNseI[i] = stackIndex.peek();
            }
            stackIndex.push(i);
        }

        for (int i =0;i<n;i++){
            System.out.print(rNseI[i] + " ");
        }


    }
}
