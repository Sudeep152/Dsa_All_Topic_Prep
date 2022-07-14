package com.company.Array.OperationOnArray;

public class Maximum_Subarray_sum {
    public static void main(String [] args){
        int [] arr = {-5,4,6,-3,4,-1};

        System.out.println(NaiveApp(arr));
    }
    static int  NaiveApp(int[] arr){
        int n = arr.length;
        int sum =0;
        for (int i =1;i<n;i++){
            int cuu=arr[0];
            cuu=cuu+arr[i];
            sum =   Math.max(sum,cuu);


        }
        return sum;
    }
}
