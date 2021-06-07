package com.company.Array.OperationOnArray;

public class LeaderInAnArrayBestApproach {
    public static void main(String [] args){

        int [] arr={7,10,4,3,6,5,2};
        bestApproach(arr);

    }
    static void bestApproach(int [] arr){
        int  n = arr.length;

        int current=arr[n-1];
        System.out.print(current+ " ");

        for (int i=n-2;i>=0;i--){

            if (arr[i]>current){
                current=arr[i];
                System.out.print(current + " ");
            }


        }


    }
}
