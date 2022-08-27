package com.company.Stack;

import java.util.Stack;
import java.util.concurrent.LinkedTransferQueue;

public class NextGreaterElementtoright {
    public static void  main(String [] args){

        int [] arr ={1,3,4,2};
        BruteForcengetr(arr);
        AdvMethod(arr);

    }
    static void  BruteForcengetr(int [] arr ){
        int n  = arr.length;
        int [] ans = new int[n];
        for (int i=0;i<n;i++){

            for (int j=i;j<n;j++){
                if(arr[i] < arr[j]){
                    ans[i] = arr[j];
                    break;
                }else {
                    ans[i] = -1;
                }


            }

        }

        for (int i=0;i<n;i++){

            System.out.print(ans[i]+ " ");
        }
    }
    static void  AdvMethod(int [] arr){
        int n= arr.length;
        int [] ans = new int[n];
        ans[n-1] = -1;
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[n-1]);
        for(int i = n -2;i>=0;i--){

            while (stack.size() > 0  && arr[i] >stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;

            }else {

                ans[i]= stack.peek();
            }
            stack.push(arr[i]);
        }
        System.out.println();
        for (int i=0;i<n;i++){

            System.out.print(ans[i]+ " ");
        }

    }
}
