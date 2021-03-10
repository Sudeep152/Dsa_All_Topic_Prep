package com.company.CodeChefMarch_Question;

import java.util.Scanner;

public class No_Time_Wait {
    public static void main(String[] args) {

        HaveTime();

    }

    static void HaveTime(){

        Scanner scanner=new Scanner(System.in);

        int N=scanner.nextInt();
        int xH=scanner.nextInt();
        int Time=scanner.nextInt();

        for (int i=1;i<=N;i++){

            int val=scanner.nextInt();

            if (val+Time >= xH  ){
                System.out.println("YES");
            }
        }
        System.out.println("NO");
    }
}