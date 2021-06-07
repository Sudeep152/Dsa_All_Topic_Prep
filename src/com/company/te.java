package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class te {
    public static void main(String [] args){


int  []arr= {20,124,0,21,0,23,45};
move(arr);


    }
     static void move(int []  arr){

        int n = arr.length;
        int count=0;
         ArrayList<Integer> ar = new ArrayList<>();
         for (int i=0;i<n;i++){
             if(arr[i]==0){
                 count++;
             }
             if(arr[i]!=0){
                 ar.add(arr[i]);

             }
         }


         for (int i=0;i<count;i++){
             ar.add(0);
         }


         System.out.print(ar);



     }

}
