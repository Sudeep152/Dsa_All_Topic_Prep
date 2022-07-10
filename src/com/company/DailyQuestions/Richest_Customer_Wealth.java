package com.company.DailyQuestions;

public class Richest_Customer_Wealth {
    public static void main(String [] args){

        int [] arr ={2,8,7};
       // System.out.print(sumArray(arr));
        int [][] arr1 ={{1,2,3},{3,2,1}} ;


   System.out.println(  maximumWealth(arr1));

    }
    static int maximumWealth(int[][] accounts) {


        int n= accounts.length;
       int max= sumArray(accounts[0]);
        for (int i =1;i<n;i++){

            if (max<sumArray(accounts[i])){
                max= sumArray(accounts[i]);
            }

        }
return max;

    }

    static int sumArray(int [] arr){
        int n =arr.length;
        int sum =0;
        for (int i=0;i<n;i++){
            sum= sum+arr[i];
        }
        return sum;
    }
}

