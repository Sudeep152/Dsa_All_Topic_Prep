package com.company.CodeChefMarch_Question;

import java.util.Scanner;

public class Chef_and_Candies {
    public static  void  main (String  [] args){



        Candy2();
    }
    static void Candy(){

        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0){
            int child_n = sc.nextInt();
            int candy_n = sc.nextInt();
            int ans =0;
            if (candy_n > child_n){
                ans= child_n -candy_n;
                if (ans > 0){
                    System.out.println(ans);
                }else {
                    System.out.println(0);
                }




            }

            else {
                ans = child_n-candy_n;


                    if (ans ==1){
                        System.out.println(ans);
                    }else
                        if (ans%2!=0){
                            System.out.println((ans+1)/4);
                        }
                        else {
                            System.out.println(ans/4);
                        }





            }





        }




    }

    static void Candy2(){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0){
            int BacchoKiSankhya_N =sc.nextInt();
            int CandyKiSankhya_X = sc.nextInt();

            int ans = BacchoKiSankhya_N-CandyKiSankhya_X;
            int buy = ans/4;

            if (BacchoKiSankhya_N < CandyKiSankhya_X){
                System.out.println(0);
            }else {
                if(ans%4==0){
                    System.out.println(buy);
                }else {
                    System.out.println(buy+1);
                }
            }






        }








    }
}
