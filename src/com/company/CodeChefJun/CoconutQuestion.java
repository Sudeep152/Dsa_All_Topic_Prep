package com.company.CodeChefJun;

import java.util.Scanner;

public class CoconutQuestion {
    public static void main(String [] args){


  totalCoco();

    }
    static void totalCoco(){

        Scanner scanner=new Scanner(System.in);
        int T = scanner.nextInt();
        int count=0;
        while (T-->0){

            int xa =scanner.nextInt();
            int xb =scanner.nextInt();

            int Xa=scanner.nextInt();
            int Xb=scanner.nextInt();

            if (Xa % xa==0 && Xb% xb==0){
               count = Xa/xa + Xb/xb;

            }

           System.out.print(count);
        }

    }
}
