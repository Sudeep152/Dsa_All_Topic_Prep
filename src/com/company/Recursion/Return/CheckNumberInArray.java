package com.company.Recursion.Return;


public class CheckNumberInArray {
    public  static void  main(String [] args){

        int []  arr = {1,2,3,4};
        System.out.println(checker(arr,1));
        System.out.println(bestChecker(arr,0,1));

    }
    static   boolean  checker(int [] arr,int n){
        if(arr.length ==0){
            return false;
        }
        if(arr[0] == n){
            return true;
        }

        int [] smallProblem = new int[arr.length-1];
        for (int i =1;i<arr.length;i++){
            smallProblem[i-1]= arr[i];
        }


        return checker(smallProblem,n);
    }


    static boolean  bestChecker(int [] arr,int stater,int k){

        if (stater ==arr.length-1){
            return false;
        }
        if (arr[stater] == k){
            return true;
        }

        return bestChecker(arr,stater+1,k);
    }
}
