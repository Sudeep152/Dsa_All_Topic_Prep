package com.company;

import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.util.*;
public class Vipin {
    public static void main(String[] args) {


//      Integer p =0;
//      Integer q =7;
//        Integer r=4;
//        q=(1&1)+q;
//        if((p&q)<(r^p)){
//            r=(3+5)+r;
//        }else {
//            p=r+p;
//        }
//q=r+q;
//        if((1+5)>(p-1)){
//            q=7+r;
//        }
//        r=r+r;
//        System.out.println(p+q+r);

  //      System.out.println(d(9,8));


        int p =5,q=2,r=9;
        for (r=5;r<6;r++){
            if ((3-4) <(10-p)){
                break;
            }
            q=1+p;
            p=(p+7)&p;
        }
        System.out.println(p+q);

    }

    static int d(int a, int b,int  c) {

        if((c&a&b) < (b&c)){
            if((8^a^8) <(8^8)){
                c=(b+4)+c;
            }
            a=(a+6)^a;
            b=(c^10)+c;
        }else {
            b=(c+1)+c;
            if ((a^b^c)<(b+c+a)){
                c=b&c;
                a=(a^c)&c;
            }
            b=5&b;
        }
        return a+b+c;

    }

}