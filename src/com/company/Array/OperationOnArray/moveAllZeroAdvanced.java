package com.company.Array.OperationOnArray;

public class moveAllZeroAdvanced {
    public static void main(String [] args){


    }
    static void  move(int [] arr){

        int n = arr.length;
        int count=0;
        for (int i=0;i< n;i++){

            if (arr[i]!=0){

                swap(arr[i],arr[count] );

            }
        }


    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;


        return;

    }
}
