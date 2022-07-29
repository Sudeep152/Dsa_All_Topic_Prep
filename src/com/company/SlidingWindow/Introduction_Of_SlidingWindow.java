package com.company.SlidingWindow;

public class Introduction_Of_SlidingWindow {
    public static void main(String [] args){


        int []ar = {2,3,5,2,9,7,1};
        NaiveApproach(ar,3);
    }
    static  void NaiveApproach(int [] arr, int digit){

        int n= arr.length-1;
        int [] sumOfArr = new int[n];

        for (int i=0;i<n;i++){
        int sum =0;
            for (int j =i; j<digit;j++){

                System.out.print(arr[j]);
            }
System.out.println();

        }



    }
}
