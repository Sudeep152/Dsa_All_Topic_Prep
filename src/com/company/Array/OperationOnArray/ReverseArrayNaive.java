package com.company.Array.OperationOnArray;

import java.util.ArrayList;

public class ReverseArrayNaive {
    public static void main(String [] args){

        int []arr={30,7,6,5,10};
        System.out.println(reverse(arr));


    }
    static ArrayList<Integer> reverse(int [] arr){

        ArrayList<Integer> Rar =new ArrayList<>();
        int prev=0;
        for (int i=arr.length-1;i>=0;i--){
            prev=arr[i];
            Rar.add(prev);

        }

        return Rar;
    }
}
