package com.company;

public class Main {

    public static void main(String[] args) {

        Toh(3,'A','B','C');

    }
    static void  Toh(int n,char A,char B ,char C){

        if (n==1){
            System.out.println("Disk "+n +" move "+A+" to "+ C);
            return;
        }
        Toh(n-1,A,C,B);
        System.out.println("Disk "+n + " move " + A + " to " +C);
        Toh(n-1,B,A,C);





    }
    }


