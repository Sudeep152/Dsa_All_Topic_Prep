package com.company.Array.OperationOnArray;

public class Find_Largest_Elements_Naive_Method {
    public static void main(String[] args){

        int [] arr={1,2,7,5};

        System.out.println(LargestEle(arr));
    }
    static int LargestEle(int[] arr){
         int n=arr.length;


        for (int i=0;i< n;i++){
            boolean flag=true;
            for (int j=0;j<n;j++){
                if (arr[j] > arr[i]){

                   flag=false;
                   break;
                }

            }
            if (flag==true){
                return i;
            }

        }

      return -1;
    }

}
