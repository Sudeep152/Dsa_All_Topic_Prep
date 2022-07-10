package com.company.CodeChefMarch_Question;
import java.util.Scanner;

public class Pass_the_Exam {
    public static  void main(String [] args){

        PassOrFail();

    }

    static  void PassOrFail(){

        Scanner  sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-->0){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int min  =10;
          int sum =0;
            if (a < min || b <min || c <min){
                System.out.println("Fail");
            }else {
                sum = a+b+c;
                if (sum >= 100) {
                    System.out.println("Pass");
                }else {
                    System.out.println("Fail");

                }

            }


        }


    }
}
