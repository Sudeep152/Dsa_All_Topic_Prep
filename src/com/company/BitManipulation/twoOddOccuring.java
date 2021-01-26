package com.company.BitManipulation;

public class twoOddOccuring {
    public static  void main(String [] args){

        int arr[]={1,1,2,3,4,4,5,5};
        twoOdd(arr);
    }
    static   void twoOdd(int arr[]){
        int Xor=0;
        int rightMostSetbit=0;
        int first=0;
        int sec=0;

        for (int i=0;i<arr.length;i++){
            Xor=Xor+arr[i];
        }
        System.out.println(Xor);
        rightMostSetbit=Xor & ~(Xor-1);
        System.out.println(rightMostSetbit);

        for (int i=0;i< arr.length;i++){

            if ((rightMostSetbit& arr[i])!=0){
                first=first^arr[i];
            }else{
                sec=sec^arr[i];
            }
        }
       System.out.println(first+ "," +sec);


    }
}
