package com.company;
import java.util.Scanner;

public class Shashank {
    public static  void main(){

        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        System.out.print(find_digit(s, n));


    }
    static int find_digit(String s, int n)
    {
        int first_digit = -1;
        for (int i = n - 1; i >= 0; i--)
        {
            if (s.charAt(i) < '0' ||
                    s.charAt(i) > '9')
            {
                first_digit = i;
                break;
            }
        }
        first_digit++;

        int s_len = first_digit;

        int num = 0, pw = 1;
        int i = n - 1;
        while (i >= 0)
        {


            if (s.charAt(i) >= '0' &&
                    s.charAt(i) <= '9')
            {


                int digit = s.charAt(i) - '0';
                num = num + (pw * digit);

                if (num >= s_len)
                    return -1;
                pw = pw * 10;
            }
            i--;
        }

        num = num * 10;

        int req = s_len - num;

        if (req > 9 || req < 0)
            return -1;
        return req;
    }


}



