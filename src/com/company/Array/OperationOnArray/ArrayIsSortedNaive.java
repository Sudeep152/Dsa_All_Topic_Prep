package com.company.Array.OperationOnArray;

public class ArrayIsSortedNaive {
    public static void main(String [] args){

        int []arr ={1,2,3,2 };
        System.out.println(Sorted(arr));

    }
    static boolean Sorted(int []arr){



        for (int i=0;i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++) {
                if (arr[j]<arr[i]) {
                    return false;

                }

            }

        }
        return true;
    }
}
