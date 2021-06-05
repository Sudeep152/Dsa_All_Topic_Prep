package com.company.Array.OperationOnArray;

public class MoveAllZero {
    public static void main(String [] args){

        int [] arr= {0,0,8,10,0};


        int [] arr1=move(arr);
           for (int i=0;i<arr.length;i++){
               System.out.println(arr1[i]);
           }
           //swap(2,3);

    }
    static int[] move(int [] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) {
                for (int j = i + 1; j < n; j++) {

                    if (arr[j] != 0) {
                        swap(arr[i], arr[j]);

                    }
                   
                }
            }
           return arr;

        }


    return null;
    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println(a+" "+b);

    }
}
