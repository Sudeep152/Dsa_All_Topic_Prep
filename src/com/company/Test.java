package com.company;

public class Test {
    public static void main(String [] args){


        int arr[]={1,2,3,4,5};
        rotate(arr);

    }
    static  void  rotate(int [] arr) {

        int n= arr.length;
        int low = 0;
        int high =n-1;


        while (low<high){

            int temp = low;
            arr[low] = arr[high];
            arr[high]= arr[temp];
             high--;
             low++;
        }



        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
