package com.moshcoder;

import java.util.ArrayList;

public class StringAllPermutation {

    public static void main(String[] args) {
        String str1 = "PQR";
        System.out.println("The given string is: PQR");
        System.out.println("The permuted strings are:");
        showPermutation(str1, "");
        String num = "123";
        simplyRecursiveTest(num, "");

    }

    private static void simplyRecursiveTest(String num, String s) {
        if(num.length() == s.length()){
            System.out.println(s);
            return;
        }
        for (int i = 0; i < num.length(); i++) {
            simplyRecursiveTest(num, s + num.charAt(i));

        }
    }


    private static void showPermutation(String str1, String NewStringToPrint) {
        if (NewStringToPrint.length() == str1.length()) {
            System.out.println(NewStringToPrint);
            return;
        }
        for (int i = 0; i < str1.length(); i++) {

            showPermutation(str1, NewStringToPrint + str1.charAt(i));
        }
    }
}

