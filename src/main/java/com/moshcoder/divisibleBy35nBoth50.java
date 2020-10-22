package com.moshcoder;

import java.util.Arrays;

public class divisibleBy35nBoth50 {

    public static void main(String[] args) {
        /*
        1. 1-100
        2. %3
        3. %5
        4. %3 n 5
            start the other way round
            1. filter
         */

        System.out.println("test".isEmpty());
        System.out.println("\n\nDivided by 5 & 3: ");
        for (int i = 1; i < 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) System.out.print(i + ", ");
        }

        System.out.println("\n\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {

            if (i % 3 == 0) System.out.print(i + ", ");

        }

        System.out.println("\n\nDivided by 5: ");
            for (int i = 1; i < 100; i++) {

                if(i%5==0) System.out.print(i + ", ");


        }


    }
}
