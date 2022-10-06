package com.company.DSAPLACEMENTSHEET;

import java.util.Scanner;

public class SetMatrixZero {
    public  static  void main(String [] args){

        int [][] matrix ={{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        setZeroes(matrix);
        Scanner sc = new
                Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();



    }
    public  static  void setZeroes(int[][] matrix) {

        int row = matrix.length;;
        int coloum = matrix[0].length;

        for(int i =0,j =0 ;i<row && j<coloum;j++){
            if (matrix[i][j]==0){
                System.out.println(i+ ","+j);
            }
        }

        for(int i =0,j =0 ;i<row && j<coloum;i++){
            if (matrix[i][j]==0){
                System.out.println(i+ ","+j);
            }
        }


    }
}
