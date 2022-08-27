package com.company.Recursion.Return;

public class FirstIndexOfNumber {
    public static void main(String [] args){
//
//        int [] arr = {9,10,8};
//        System.out.println(first_Index(arr,10));

        System.out.println(multiplyTwoIntegers(2,2));


    }
    static int first_Index(int  [] arr,int k){

        if(arr.length==0|| arr[1]==k){
            return 1;
        }

        if (arr[1] != k) {
            return -1;
        }

        int [] test = new int[arr.length-1];
        for (int i=1;i<test.length;i++){
            test[i-1] = arr[i];
        }
        return first_Index(arr,k);


    }


    public static int[] allIndexes(int input[], int x,int start) {



        if(start == input.length){
            int [] output = new int [0];
            return output;

        }

        int [] smallAn = allIndexes(input,x,start+1);

        if(input[start] == x){
            int [] newAns = new int[smallAn.length+1];
            newAns[0]= start;

            for(int  i=0;i<newAns.length;i++){
                newAns[i+1] = smallAn[i];
            }
            return newAns;

        }else{
            return   smallAn;
        }

    }
    public static int multiplyTwoIntegers(int m, int n){
        // Write your code here
        if(n==0){
            return 0;
        }
        if( m==0){
            return 0;
        }
        int multi=0;
        multi=   n + m +multiplyTwoIntegers(m-1,n-1);

        return multi;


    }
}
