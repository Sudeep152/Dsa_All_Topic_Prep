package com.company.Array.OperationOnArray;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashSet;

public class FrequincesinASortedArray {
    public static void main(String [] args){

      int [] arr={10,10,10,20,23,23};
      frequinces(arr);
    }
    static  void frequinces(int [] arr) {
        int n = arr.length;
        int freq=1;
        int i=1;
        while (i<n){

            while (i<n && arr[i] == arr[i-1]){
                freq++;
                i++;
            }

            System.out.println(arr[i-1] + " " + freq);
            i++;
            freq=1;

        }

        if (n==1 || arr[n-1]!=arr[n-2]){

            System.out.print(arr[n-1] + " " + 1);
        }




    }

    }

