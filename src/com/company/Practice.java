package com.company;


import java.util.*;

public class Practice {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        while (T--> 0)
        {
            int n;
            n = sc.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0; i < n ; i++)
            {

                a[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> MAP = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; ++i)
            {

                MAP.put(a[i],a[i]++);
            }
            int maxFreq = 0;
            for (int i = 0; i < n; ++i)
            {
                if (maxFreq < MAP.get(a[i]))
                {
                    maxFreq = MAP.get(a[i]);
                }
            }
            if (maxFreq > (n + 1) / 2)
            {
                System.out.print("NO");
                System.out.print("\n");
            }

            else
            {
                System.out.print("YES");
                System.out.print("\n");
            }

        }


    }


}





