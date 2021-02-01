package com.company;

public class Main {

    public static void main(String[] args)
    {
      int[] arr ={1,1,2,3,4,4};
      occurring(arr);
    }
    static  void occurring(int[] arr){
        
        int First =0;
        int second=0;
        int Xor=0;
        int rmsb;

        for (int i=0;i< arr.length;i++){

            Xor= Xor^i;

        }
        rmsb=Xor & -Xor;
        for (int j : arr) {

            if ((rmsb & j) != 0) {
                First = First ^ j;
            } else {
                second = second ^ j;
            }

        }

        System.out.println(First+ ","+second);
    }
    }

