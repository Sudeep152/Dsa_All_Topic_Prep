package com.company.Array.OperationOnArray;

import java.util.ArrayList;

public class Search_Unsorted {
    public static void main(String []  args){

        int arr[]= {2,1,3,4,5};
        System.out.println(findELe(arr,6));



    }
    static boolean findELe(int arr[],int ele){

        for (int i=0; i<arr.length;i++){
            if (arr[i] ==  ele){
                return  true;
            }

        }

        return false;
    }
}
