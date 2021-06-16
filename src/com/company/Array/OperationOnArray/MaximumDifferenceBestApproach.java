package com.company.Array.OperationOnArray;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;

public class MaximumDifferenceBestApproach {
    public static void main(String [] args){

        int [] arr={7,9,5,6,3,2};
        bestApproach(arr);


    }
    static void bestApproach(int [] arr){
        int res = arr[1]-arr[0];
        int minVal = arr[0];

        for (int i=1;i<arr.length;i++){

            res= Math.max(res,arr[i]-minVal);
            minVal=Math.min(minVal,arr[i]);
        }

        System.out.print(res);

    }

}
