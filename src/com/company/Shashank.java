package com.company;

public class Shashank {
    public static void main(String[] args) {


    }

    void frequencyOfCharacters(String input) {
        // TODO: Add code here
        int b =0;
        int f =0;
        int j =0;
        int p =0;
        int v =0;
        int other =0;

        for(int i =0;  i<input.length();i++){

            if(input.charAt(i) =='b') b++;
            else if(input.charAt(i)=='f')f++;
            else if(input.charAt(i)=='j')j++;
            else if(input.charAt(i)=='p')p++;
            else if(input.charAt(i)=='v')v++;
            else {
                other++;
            }
        }
        System.out.println('b'+" "+b);
        System.out.println('f'+" "+f);
        System.out.println('j'+" "+j);
        System.out.println('p'+" "+p);
        System.out.println('v'+" "+v);
        System.out.println('o'+" "+other);

    }

}
