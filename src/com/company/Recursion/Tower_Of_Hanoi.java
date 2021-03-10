package com.company.Recursion;

public class Tower_Of_Hanoi {
    public static  void main(String [] args){

//      TOH(3,'A','B','C');
       System.out.println( TohCount(3,1,2,3));

    }
    static void  TOH(int n,char A,char B, char C){

        if (n==1){
            System.out.println("Move Disk  "+n +" From Rod "+ A +" To "+C);
            return;
        }

        TOH(n-1,A,C,B);
        System.out.println( "Move Disk " + n + " From Rod " + A + "To" + C);
        TOH(n-1,B,A,C);




    }
    static int TohCount(int n,int a ,int b,int c){

        int count =0;
        if(n>=1){

            count=count+TohCount(n-1,a,c,b);
            System.out.println("Move Disk " + n + " From Rod " + a + "To" + c);

            count++;

            count=count+TohCount(n-1,b,a,c);

        }


        return count;
    }



}
