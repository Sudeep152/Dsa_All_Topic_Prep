package com.company;

import java.util.*;

public class Vipin {
    public static void main(String[] args) {

        Scanner s=new Scanner(System  .in);
        int test=s.nextInt();
        while(test-->0) {
            int n=s.nextInt();
            int []a=new int[n];
            int []b=new int[n];
            int i;
            for(i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            for(i=0;i<n;i++)
            {
                b[i]=s.nextInt();
            }
            int sum=0;
            int diff=0;
            for(i=0;i<n;i++)
            { int x=a[i]-b[i];
                diff+=x;
                if(x>0)
                    sum+=x;

            }
            if(diff==0)
                System.out.println(sum);
            else
                System.out.println(-1);

        }

    }

}