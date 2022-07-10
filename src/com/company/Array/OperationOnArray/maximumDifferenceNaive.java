package com.company.Array.OperationOnArray;

import java.util.ArrayList;
import java.util.Collections;

public class maximumDifferenceNaive {
    public static void main(String []  args){


        int [] arr={3,5,1,7,4,9,3};
//        maxNaive(arr);

  //      System.out.println(maxDif(arr));
        System.out.println(maxDiffBestApp(arr));

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


    static int maxDif(int []arr){
        int n= arr.length;
        int max =arr[1]-arr[0];
        for (int i=0;i<n-1;i++){
            for (int j =i+1;j<n;j++){
                 max = Math.max(max,(arr[j]-arr[i]));
            }
        }
        return max;
    }



    static int maxDiffBestApp(int [] arr){
        int n= arr.length;
        int res= arr[1]-arr[0];
        int min = arr[0];
        for (int i =1;i<n;i++){

            res = Math.max(res,arr[i]- min);
            min = Math.min(min,arr[i]);

        }

        return  res;

    }
}
