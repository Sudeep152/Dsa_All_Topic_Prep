package com.company.Array.OperationOnArray;

public class ArrayisSortedEfficient {
    public static void main(String []  args){


        int []arr ={1,2,3,4,3};
        System.out.println(EfficientMethod(arr));

    }
    static boolean EfficientMethod(int [] arr){

        for (int i=1;i<arr.length;i++){

            if (arr[i]<arr[i-1]){
                return false;
            }
        }
     return true;
    }
}
