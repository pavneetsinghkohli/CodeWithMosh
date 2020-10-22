package com.moshcoder;

import java.util.Scanner;

public class sumOFDigits33 {

    public static void main(String[] args) {

        System.out.print("Input an Integer please : ");

        Scanner scanner = new Scanner(System.in);

        int inte = scanner.nextInt();

        System.out.println("The sum of the digits is: " +sum(inte));


    }

    /* 1. take the input
     * 2. get the single digit, until the number finish
     * 2.5. reduce the last digit once copied from the main int.
     * 3. sum the digits. */

    public static int sum(int inte) {
        int s = 0;
        while (inte != 0) {
            s += inte % 10;
            inte /= 10;

        }
        return s;

    }


}
