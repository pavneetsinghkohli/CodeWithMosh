package com.moshcoder;

public class commonDigit64 {
    public static void main(String[] args) {
        System.out.println(commonDigit());
    }

    public static int randomNumber(int min, int max) {
        return ((int) ((Math.random() * (max - min)) + min));
    }

    public static boolean commonDigit() {
        int x = randomNumber(25, 75);
        int y = randomNumber(25, 75);
        int a = x % 10;
        int b = x / 10;
        int c = y % 10;
        int d = y / 10;
        System.out.printf("a = %d, b = %d, c = %d, d = %d \n also x = %d, y = %d \n", a, b, c, d, x, y);
        if ((a == b) || (a == c) || (a == d) || (b == c) || (d == b) || (c == d)) return true;
        return false;
    }

/*

    int a = x % 10;
    int b = x / 10;
    int c = y % 10;
    int d = y / 10;

        System.out.printf("a = %d, b = %d, c = %d, d = %d", a, b, c, d);
    boolean result = false;
        if ((a == b) || (a == c) || (a == d) || (b == c) || (d == b) || (c == d)) {

        result = true;
    }
        System.out.println("\n Result is : " + result);

 */
    /*
        1. set random to get integer values for 2
        2. concatenate them into string
        3. if to compare their values and return true


        int x = (int) ((Math.random() * (75 - 25)) + 25);
        int y = (int) ((Math.random() * (75 - 25)) + 25);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int a = x % 10;
        int b = x / 10;
        int c = y % 10;
        int d = y / 10;

        System.out.printf("a = %d, b = %d, c = %d, d = %d", a, b, c, d);
        boolean result = false;
        if ((a == b) || (a == c) || (a == d) || (b == c) || (d == b) || (c == d)) {

            result = true;
        }
        System.out.println("\n Result is : " + result);

         */

}
