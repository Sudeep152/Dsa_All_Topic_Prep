package com.company.Array.OperationOnArray;

import java.util.ArrayList;
import java.util.Collections;

public class maximumDifferenceNaive {
    public static void main(String []  args){


        int [] arr={30,10,8,2};
        maxNaive(arr);


    }
    static void maxNaive(int [] arr){
        int max=0;
        int n= arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<n;i++){

            for (int j=i+1;j<n;j++){

                max= arr[j]-arr[i];
                list.add(max);

            }

        }


        System.out.print(Collections.max(list));
    }
}
