package com.company.DifferentSitesQuestion;

import java.util.ArrayList;
import java.util.List;

public class Subset_Sum_Problem {
    public static  void main(String [] args){

        subset(543);
       // System.out.println(countD(53));


    }
    static  void  subset(int n){

        List<Integer> arr =new ArrayList<Integer>();
        int no= countD(n);
        int length= (int) Math.pow(2,n);

        for (int counter=0;counter<length;counter++){

            for (int i=0;i<no;i++ ){

                if ((counter & (1<<i))!=0){
                      arr.add(counter);
                }
            }

        }
        System.out.println(arr);


    }
    static int countD(int n) {
        int count = 0;
        while (n != 0) {


            count++;
            n = n /10;
        }

        return count;

    }

}
