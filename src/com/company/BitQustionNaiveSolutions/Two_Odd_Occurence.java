package com.company.BitQustionNaiveSolutions;

public class Two_Odd_Occurence {
    public static void main(String [] args){
        int [] arr={4,3,4,4,4,5,5,3,1,2};

        TwoOdd(arr);
    }
    static  void  TwoOdd(int [] arr){



        for (int i=0;i< arr.length;i++){
            int count=0;
            for (int j=0;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }

            }
            if (count%2!=0){
                System.out.println(arr[i]);
            }


        }



    }
}
