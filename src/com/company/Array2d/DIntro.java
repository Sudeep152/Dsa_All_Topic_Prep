package com.company.Array2d;

import java.util.Scanner;

public class DIntro {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int colm= sc.nextInt();

        int [][] arr = new int[row][colm];

        for (int i =0;i<row;i++){
            for (int j =0;j<colm;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i =0;i<row;i++){
            for (int j =0;j<colm;j++){
                System.out.print(arr[i][j]+ " ");;
            }
            System.out.println();
        }


        for (int i =0;i<row;i++){
            for (int j =0;j<colm;j++){
                System.out.print(arr[i][j]+ " ");;
            }
            System.out.println();
        }


    }
}
