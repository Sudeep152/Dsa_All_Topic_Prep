package com.company.Array2d;

public class matrixMulti {
    public static void main(String [] args){


    }
    static  void  matrixMulti(int [][] arr1,int [][]arr2){

        int  arr1Col = arr1[0].length;
        int arr2Row = arr2.length;
        int [][] answer = new int[arr1.length][arr2[0].length];

        if (arr1Col!=arr2Row){
            System.out.println("invalid multiplication");
        }else {

            for (int i =0;i<arr1.length;i++){

                for (int j =0;j<arr2[0].length;j++){

                    answer[i][j]= arr1[i][j]*arr2[i][j];
                }

            }


        }
        for (int i =0;i<arr2Row;i++){
            for (int j =0;j<arr1Col;j++){
                System.out.print(answer[i][j]+ " ");;
            }
            System.out.println();
        }



    }
}
