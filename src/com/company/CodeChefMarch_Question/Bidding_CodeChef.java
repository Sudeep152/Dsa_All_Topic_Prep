package com.company.CodeChefMarch_Question;

import java.util.HashMap;
import java.util.Scanner;

public class Bidding_CodeChef {
    public static void main(String [] args){


        Bidding_T();
    }

    static  void  Bidding_T(){

        Scanner sc = new Scanner(System.in);

        int T=sc.nextInt();


        while (T-->0){


            int alice = sc.nextInt();
            int bobby = sc.nextInt();
            int charli =sc.nextInt();

            int max = Math.max(alice,(Math.max(bobby,charli)));

            if (max == alice){
                System.out.println("Alice");
            }else if(max == bobby){
                System.out.println("Bob");
            }else {
                System.out.println("Charlie");
            }


        }





    }
}

