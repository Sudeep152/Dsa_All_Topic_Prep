//package com.company;
//
//import java.util.*;
//
//public class Vipin {
//    public static void main(String[] args) {
//
//        int [][] arr={{2,3},{5,7}};
//
//        int [][] anss= solve(arr);
//
//        for(int[] row : anss) {
//            for (int column : row) {
//                System.out.print(column + "    ");
//            }
//            System.out.println();
//        }
//
//
//
//    }
//    static int [][]  solve(int [][] arr){
//
//        int n = arr.length;
//        int rows = arr.length, columns = arr[0].length;
//
//        int[][] sum = new int[rows][columns];
//        for(int i = 0; i < rows; i++) {
//            for (int j = 1; j < columns; j++) {
//                sum[i] = arr[i];
//                sum[j]=arr[j]+arr[j-1];
//            }
//        }
//
//        return sum;
//
//    }
//
//
//}