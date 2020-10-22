package com.moshcoder;

public class threeInteger62 {
    public static void main(String[] args) {
        /*
        1. 3 int
        2. check 1 - anyone should be more than 20
        3. then, others substraction should be less than this value

         */

        int x = 0, y = 19, z = 20;

        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));

    }
}
