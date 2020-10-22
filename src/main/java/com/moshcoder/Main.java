package com.moshcoder;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        //Scanner in = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        binary1 = 1001001;
        System.out.println("Input second binary number: ");
        binary2 = 1101010;

        while (binary1 != 0 || binary2 != 0)
        {
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }




    }
   /*     String s1 = "inmanylanguages";
        String s2 = "theresapairoffunctions";
        longest(s1, s2);
    }


    public static String longest(String s1, String s2) {
        String s = s1 + s2;
        System.out.println(s.chars());

        Set<Character> chars = new TreeSet<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }

        StringBuilder newCh = new StringBuilder();

        for( Character ch : chars ){
            newCh.append(ch);
        }

        System.out.println(newCh.toString());
        return newCh.toString();
    }*/

//stringBuilder and StringBuffer (parallel programming me buffer)



/*

    publicstaticStringlongest(Strings1,Strings2){
        String s = s1+s2;
        char[] c = s.toCharArray();
        Arrays.sort(c);

        System.out.println(c);

        char temp[] = new char[c.length];
//System.out.println(c.length);
        for(int i=0;i<c.length;i++){
//chara=c[i];
            if(c[i]!=c[i+1]){
                temp = c[i];
            }
            System.out.println(temp);
        }
        System.out.println("ss"+newString(temp));
        return"check";
    }
*/


