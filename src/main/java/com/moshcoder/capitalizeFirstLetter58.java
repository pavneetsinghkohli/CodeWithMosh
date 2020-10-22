package com.moshcoder;

import java.util.Arrays;
import java.util.Scanner;

public class capitalizeFirstLetter58 {
    public static void main(String[] args) {
        /*
        1. Input from Scanner and system input
        2. insert the input into Scanner
        3. find the first break as word
        4. while loop, till it has another word
        5. use character to zero the 0 index to upppercase
          6. add a space
         */

        String upper_case = "";

        //Scanner in = new Scanner(System.in);
        System.out.println("input pls :");
        String line = "the quick brown fox, jumps over the lazy little dog.";

        //Scanner lineScan = new Scanner(line);
        String[] words = line.split("[ ]+");
        System.out.println(Arrays.toString(words));
        System.out.println("Penultimate word: " + words[words.length - 2]);
        String reverse = words[words.length - 2];
        System.out.println(new StringBuilder(reverse).reverse());


        System.out.println(reverse.charAt(5));
        String newSt = "";

        for (int i = (reverse.length() -1); i >= 0; i--) {
            newSt += reverse.charAt(i);
        }
        System.out.println("newST :" + newSt);


/*
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case += word.substring(0, 1) + Character.toUpperCase(word.charAt(1)) + word.substring(2) + " ";
        }
        System.out.println(upper_case.trim());


 */
    }
}
