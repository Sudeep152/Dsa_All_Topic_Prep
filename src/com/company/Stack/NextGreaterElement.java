package com.company.Stack;

public class NextGreaterElement {
    public static void main(String [] args){

        int [] arr ={1,2,3,4,5,6};

        arr = NGE_BruteForce(arr);

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
    static int [] NGE_BruteForce(int [] arr){

        int  n = arr.length;
        int [] answer= new int[n];

        for (int  i =0;i<n;i++){


            for (int j=i+1;j<n;j++){

                if(arr[j]>arr[i]){
                    answer[i] =arr[j];
                    break;
                }else {
                    answer[i]=-1;
                }

            }


        }


        return answer;

    }
}
