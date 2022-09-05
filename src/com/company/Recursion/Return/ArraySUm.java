package com.company.Recursion.Return;

import java.util.ArrayList;

public class ArraySUm {
    public static void main(String  [] args){

        int [] arr ={1,0,2,3,0,4,5,0};
 duplicateZeros(arr);
    }
   static public void duplicateZeros(int[] arr) {

        int n  = arr.length;

        ArrayList<Integer> list=  new ArrayList<>();

        for(int  i =0 ;i<n ;i++){

            if(arr[i] ==0 ){
                list.add(0);
                list.add(0);

            }else{

                list.add(arr[i]);
            }


        }


       System.out.print("[");

       for(int i =0;i<n-1;i++){
           System.out.print(list.get(i)+",");
       }
       System.out.print(list.get(n-1));
       System.out.print("]");


   }

}
