package com.company;

import java.util.*;

public class Vipin {
    public static void main(String[] args) {


        int [] ar= {1,4,5,4,5};

        System.out.println(minimal(ar.length,ar));
    }

    static  int minimal(int input1, int [] input2){

        int sum= 0;
        for(int i =0;i<input1;i++){
            for (int j =i+1;j<input1;j++){
                if (input2[i]  ==input2[j]){
                    int [ ] count = new int[]{1};
                    input2[i]= input2[i]+2;
                }
            }
        }

        for (int i=0;i<input1;i++){
            sum =sum+input2[i];
        }
        return sum;
    }
}