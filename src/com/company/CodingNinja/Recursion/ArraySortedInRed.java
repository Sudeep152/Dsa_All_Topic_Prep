package com.company.CodingNinja.Recursion;

public class ArraySortedInRed {
    public static void main(String [] args){

        int input[]={2,3,2,4,5};
        System.out.println(checkArr(input));
    }
    static boolean checkArr(int input[]) {

        if (input.length <= 1) {
            return true;
        }

        int smallProb[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallProb[i - 1] = input[i];
        }
        boolean result = checkArr(smallProb);
        if (!result) {
            return false;
        }
        if(input[0]<=input[1]){
            return  true;
        }{
            return false;
        }


    }
}
