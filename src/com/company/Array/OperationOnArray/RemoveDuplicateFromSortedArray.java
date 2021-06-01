package com.company.Array.OperationOnArray;

import java.lang.reflect.Array;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String [] args){

        int [] arr={10,20,20,30,30,30,30};
     //    int [] arr={1,2,3};
        System.out.println(arr.length);
        remove(arr,arr.length);


    }
    static void remove(int []arr,int n){

        n= arr.length;
        HashSet<Integer> list = new HashSet<>();
        int ele=0;
        for (int i=0;i< n;i++){
            ele=arr[i];
            list.add(ele);
        }

       System.out.println(list.size());
    }
}
