package com.company.Array.OperationOnArray;

public class LeftRotateByDEfficient {
    public static void main(String [] args){

        int [] arr={1,2,32,3,4};
        rotate(arr,2);

    }
    static void rotate(int [ ] arr,int d){
        int  n = arr.length;

        int []temp = new int[0];

        for (int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for (int i=d;i<n;i++){

            arr[i-d]=arr[i];
        }
        for (int i=0;i<d;i++){
            arr[n-d+i] = temp[i];

        }

           for (int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
           }

    }
}
