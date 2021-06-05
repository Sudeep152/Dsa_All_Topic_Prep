package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class te {
    public static void main(String [] args){


        int [] arr={1,2,3,4,5};
        int k=2;
        System.out.println(countArray(arr,k));
        System.out.println(countArray2nd(arr,k));


    }
    static int countArray(int [] arr,int k){

        int count=0;

        for (int i=arr.length-1;i>=0;i--){

            for (int j=i-1;j>=0;j--){
                if (arr[i]-arr[j]==k){
                    count++;
                }

            }

        }
        return count;
    }
    static int countArray2nd(int [] arr,int k){

        int count=0;
        int cureentNo=0;
        int prev=0;
        for (int i=arr.length-1;i>=0;i--){

            cureentNo=arr[i];
            prev=arr[cureentNo-1];
            if (cureentNo - prev ==k){
                count++;
            }


        }
        return count;
    }

}
