package com.moshcoder;

import java.util.ArrayList;

public class TriangleNumberCheck {
    public static void main(String[] args) {
        long num = 10;
        System.out.println(isTriangleNumber(num));
    }

    private static Boolean isTriangleNumber(long num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            sum += i;
            System.out.println(sum);
            if(sum == num){
                return true;
            }

        }return false;
    }


    public static Boolean isTriangleNumbe(long number) {
        int counter = 0;
        long row = number / 2;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                counter++;
                System.out.print(" " + counter);


                if (counter == number && j == i) {
                    return true;
                }
            }
            System.out.println();
        }
        return false;
    }
}
