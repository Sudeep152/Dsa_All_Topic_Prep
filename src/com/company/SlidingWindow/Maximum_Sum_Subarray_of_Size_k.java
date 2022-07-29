package com.company.SlidingWindow;

public class Maximum_Sum_Subarray_of_Size_k {
    public static void main(String [] args){

        int [] arr ={2,5,1,8,2,9,1};
        int k =3;

        System.out.println(slidingApp(arr,k));

    }

    static  int slidingApp(int [] arr ,int k){

        int n= arr.length;
        int i =0;
        int j =0;
        int sum =0;
        int max =0;
        while (j<n){
            sum = sum+arr[j];

            if (j-i+1 != k){
                j++;
            }else {
                max =Math.max(max,sum);
                sum= sum-arr[i];
                i++;
                j++;
            }


        }


        return max;

    }
}
