package com.company.DailyQuestions;

public class Sum_of_Unique_Elements {
    public static void main(String [] args){

        int [] arr ={1,2,3,1,2};

        removeDoubleN(arr);


    }
    static int removeDoubleN(int [] arr){
        int n= arr.length;
        int count=1;


        for (int i =1;i<n;i++){
            if (arr[i]!=arr[i-1]){
                arr[count]= arr[i];
                count++;
            }

        }


        return count;
    }
}
