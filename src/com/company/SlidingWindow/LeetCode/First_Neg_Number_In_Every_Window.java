package com.company.SlidingWindow.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class First_Neg_Number_In_Every_Window {
    public static void main(String [] args){
        int [] arr ={12,-1,-7,8,-15,30,16,28};


       // SlidingWindowApproach(arr,3);
        naiveApp(arr,3);
    }

    static void naiveApp(int [] arr ,int k){
        int n = arr.length;

        for (int  i =0;i<n-k;i++){

            boolean flag=true;
            for (int j =i;j<=j+k;j++){
                if (arr[j] < 0){
                    flag = true;
                    System.out.println(arr[j]);
                    break;
                }
  if(flag==false){
      System.out.println("0");
  }
            }




        }



    }


    static void SlidingWindowApproach(int [] arr ,int k){

        int n= arr.length;
        int end=0;
        int start =0;
        Queue<Integer> list=new LinkedList<>();;
        long[] res = new long[n-k+1];
     int s=0;
        while (end<n){
        if (arr[end] <0){
            list.add(arr[end]);

        }
        if (end-start+1 !=k){
            end++;
        }else {

            if (list.isEmpty()){
               res[s]=0;
               s++;

            }else {
                res[s] = list.peek();
                s++;

            }
            if (      !list.isEmpty() &&  arr[start] == list.peek()){
                list.poll();
            }
            start++;
            end++;

        }

        }

        for (int i=0;i<n-k+1;i++) {

            System.out.println(res[i]);
        }



    }
}
