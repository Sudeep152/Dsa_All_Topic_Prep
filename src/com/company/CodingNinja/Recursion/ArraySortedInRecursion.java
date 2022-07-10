package com.company.CodingNinja.Recursion;

public class ArraySortedInRecursion {
    public static void main(String [] args){

        int input[]={1,2,4,5};
        System.out.println(checkArrAdvanced(input));
    }
    static boolean checkArrBasic(int input[]) {

        if (input.length <= 1) {
            return true;
        }

        int smallProb[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallProb[i - 1] = input[i];
        }
        boolean result = checkArrBasic(smallProb);
        if (!result) {
            return false;
        }
        if(input[0]<=input[1]){
            return  true;
        }{
            return false;
        }


    }


    static  boolean checkArrAdvanced(int input[],int startPoint){

        if(input.length-1 == startPoint){
            return  true;
        }
        if(input[startPoint]> input[startPoint+1]){
            return  false;
        }
        boolean result = checkArrAdvanced(input,startPoint+1);
        return result;

    }
    static boolean checkArrAdvanced(int input []){
        return checkArrAdvanced(input,0);
    }
}
