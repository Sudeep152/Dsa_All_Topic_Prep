package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Test {

    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        int T = sc.nextInt();
        while(T-->0){

            int A = sc.nextInt();
            int B= sc.nextInt();

            int small = Math.min(A,B);
            int max =Math.max(A,B);


            while(small<=max){

                if(small == max){
                    System.out.println("YES");
                    break;
                }else{
                    small=small*2;
                    if(small > max){
                        break;
                    }
                }

            }


            if (max <small){
                System.out.println("NO");
            }



        }





    }










    }

