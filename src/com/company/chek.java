package com.company;

import java.util.*;

public class chek{
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        int noRow, noCol, tempH = no * 2 - 1, numH = 1;

        for (noRow = 1; noRow <= tempH; noRow++)
        {
            for (noCol = 1; noCol <= tempH; noCol++)
            {
                if (noCol == noRow || noCol == tempH - noRow + 1)
                    System.out.print(numH);
                System.out.print("  ");
            }

            System.out.println();

            numH = (noRow <= tempH / 2) ? ++numH : --numH;
        }


    }

}

