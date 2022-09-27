package com.company.Array;

import java.util.Scanner;

public class BigOh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(checkTwoPower(n));
        } else {
            System.out.println(powerThree(n));
        }

    }

    static boolean checkTwoPower(int n) {

        if (n == 0) {
            return false;
        }
        return (int) (Math.ceil((Math.log(n) / Math.log(2))))
                == (int) (Math.floor(
                ((Math.log(n) / Math.log(2)))));

    }

    static boolean powerThree(int n) {
        if (n == 0) {
            return false;
        }
        return (int) (Math.ceil((Math.log10(n) / Math.log10(3))))
                == (int) (Math.floor(
                ((Math.log10(n) / Math.log10(3)))));


    }
}

