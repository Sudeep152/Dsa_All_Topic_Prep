package com.company.Array.OperationOnArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeftRotateByDEfficient {
    public static void main(String [] args){

        int [] arr={1,2,3,4,5,6};
       // rotate(arr,2);
        riverralMthod(arr,3);

    }
    static void rotate(int [ ] arr,int d){
        int  n = arr.length;

        int []temp = new int[d];

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


    static void riverralMthod(int []arr,int d){

        int []arrayList= new int[d];



        for (int i=0; i<d;i++){
            arrayList[i]=arr[i];

        }

        for (int i=d;i< arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<d;i++){
            System.out.print(arrayList[i]+" ");
        }


    }
}
