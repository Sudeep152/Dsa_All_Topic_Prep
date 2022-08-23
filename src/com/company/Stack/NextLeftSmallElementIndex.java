package com.company.Stack;

import java.util.Stack;

public class NextLeftSmallElementIndex {
    public static void main(String [] args){

        int  [] arr= {1,1};
        solution(arr);


    }

    static void  solution(int [] arr ){
        int  n = arr.length;
        int [] nLeftSI = new int[n];
        nLeftSI[0] = -1;
        Stack<Integer> indexStack = new Stack<>() ;
        indexStack.push(0);

        for (int i =1; i<n;i++){
            while (indexStack.size()> 0 && arr[i] < arr[indexStack.peek()]){
                indexStack.pop();
            }

            if(indexStack.isEmpty()){
                nLeftSI[i]= -1;
            }else {
                nLeftSI[i]= indexStack.peek();
            }
            indexStack.push(i);
        }




        for (int i =0;i<n;i++){
            System.out.print(nLeftSI[i] + " ");
        }
    }
}
