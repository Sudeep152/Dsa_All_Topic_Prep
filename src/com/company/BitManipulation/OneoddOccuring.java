package com.company.BitManipulation;

public class OneoddOccuring {
    public static void main(String [] args){

        int [] arr={4,3,4,4,4,5,5};
     System.out.println(oddOne(arr));


    }

    static  int oddOne(int [] arr){
        int Xor=0;

        for (int i=0;i< arr.length;i++){
            Xor=Xor^arr[i];
        }
        return Xor;
}
}
