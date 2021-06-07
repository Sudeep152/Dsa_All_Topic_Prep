package com.company.Leetcode.Math.Easy;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CandyQuestion {
    public static void main(String [] args){

        candyCount();
    }

    static void candyCount( ){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Candy Quantity");
        int n =scanner.nextInt();
        int count=0;
        ArrayList<Integer> candy =new ArrayList<>();

        System.out.print("Enter candy price");
        while (n-->0){
            candy.add(scanner.nextInt());
        }
        Collections.sort(candy);

        System.out.print("Enter Query");
        int Query =scanner.nextInt();
        int haveMoney ;

        while (Query-->0){

            haveMoney=scanner.nextInt();

            for (int i=0;i<n;i++){
                if (haveMoney<=candy.get(i)){
                   count++;
                }
                System.out.print(count);
            }

        }









    }

}
