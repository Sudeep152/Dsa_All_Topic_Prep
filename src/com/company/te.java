package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class te {
    public static void main(String [] args){


        int [] arr={28, 7, -36 ,21 ,-21, -50 ,9 ,-32}
      ;
      //  System.out.println(arr[4]);
        int abs_val = Math.abs(arr[1]);
        System.out.println(abs_val);
        System.out.println(greaterNumber(arr, arr.length));


    }
    static int missingNumber(int arr[], int size)
    {
        // Your code here

        int great= greaterNumber(arr,size);


       return great++;

    }
    static int greaterNumber(int arr [],int n){


        int max =0;
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }

        return  max;
    }
}
