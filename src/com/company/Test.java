package com.company;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size1 = scn.nextInt();
        String[] arr1 = new String[size1];
        for(int i=0;i<size1;i++){
            arr1[i]=scn.next();
        }
        int size2 = scn.nextInt();
        String[] arr2 = new String[size2];
        for(int i=0;i<size2;i++){
            arr2[i]=scn.next();
        }
        String[] ans = new String[size1+size2];
        check(arr1,arr2,size1,size2,ans);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
        public static void check(String[] arr1, String[] arr2, int n1, int n2, String[] arr3){
            int i = 0, j = 0, k = 0;
            while (i < n1 && j < n2)
            {
                arr3[k++] = arr1[i++];
                arr3[k++] = arr2[j++];
            }
            while (i < n1)
                arr3[k++] = arr1[i++];
            while (j < n2)
                arr3[k++] = arr2[j++];
        }

}


