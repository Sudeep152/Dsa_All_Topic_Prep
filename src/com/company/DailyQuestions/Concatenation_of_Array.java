package com.company.DailyQuestions;

public class Concatenation_of_Array {
    public static  void main(String []  args){

        int arr [] ={1,2,3};

        int [] ans= Concatenation_of_Array(arr);

        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    static  int  []  Concatenation_of_Array(int []arr){

        int n = arr.length;
        int [] ans = new int[n*2];

        for (int i=0;i<n;i++){
            ans[i]= ans[i+n]= arr[i];
        }

        return ans;
    }
}
