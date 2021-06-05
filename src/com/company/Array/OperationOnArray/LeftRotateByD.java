package com.company.Array.OperationOnArray;

import java.util.SplittableRandom;

public class LeftRotateByD {
    public static void main(String [] args){
        int  []arr= {1,2,3,4,5};
        int d=1;

        rotate(arr,d);


    }
    static void  rotate(int [] arr,int d){

        int n=arr.length;

        for (int i=0;i<d;i++){

            singleRotate(arr);
        }

        for (int i=0;i<n;i++){

            System.out.print(arr[i] + " ");
        }




    }
    static void  singleRotate(int [] arr){
    int n = arr.length;
    int temp =arr[0];

    for (int i=1;i<n;i++){

        arr[i-1]=arr[i];
    }
    arr[n-1]=temp;


    }

}
