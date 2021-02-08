package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CodeChefFirstQuestion {
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Divisor(n);



    }
    static void Divisor(int n){

        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=1;i<=10;i++){

            if(n%i==0){
                arr.add(i);
            }
        }
        System.out.println(Collections.max(arr));
    }



}
