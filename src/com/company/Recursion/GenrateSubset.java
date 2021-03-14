package com.company.Recursion;

import java.util.ArrayList;

public class GenrateSubset {
    public static void main(String [] args){



        String s="Don";
        printSub(s,"",0);


    }


    static void printSub(String str, String curr, int index)
    {
        if(index == str.length())
        {
            System.out.println(curr+" ");
            return;
        }

        printSub(str, curr, index + 1);
        printSub(str, curr+str.charAt(index), index + 1);
    }

}
