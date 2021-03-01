package com.company.Leetcode.Math.Easy;

public class Number_Of_Good_Pairs_1512 {
    public static void main(String [] args){

        int [] arr={1,2,3};
        good_pair(arr);

    }
    static  void good_pair(int [] arr){

        int count=0;
        for (int i=0;i< arr.length;i++){

            for (int j=i+1;j< arr.length;j++){

                if (arr[i]==arr[j]){

                    count++;
                    //System.out.println("("+i+","+j+")" + count);

                }

            }

        }

        System.out.println(count);

    }
}
