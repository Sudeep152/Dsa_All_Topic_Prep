package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LeetCode {
    public static void main(String[] args) {


        int [] ar ={1,1,2};


        System.out.println(removeElement(ar,2));


    }

    static int removeElement(int [] arr,int k){

        int n = arr.length;
        int value_size =0;
        for (int i =0;i<n;i++){
            if (arr[i]!=k){
                arr[value_size]=arr[i];
                value_size++;
            }
        }


        return value_size;
    }
      }


