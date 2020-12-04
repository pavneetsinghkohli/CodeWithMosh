package com.moshcoder;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.println(pattern(5));

    }

    private static String pattern(int n) {
        StringBuilder s = new StringBuilder("");

        return repeat(n, 0, s);
    }


    private static String repeat(int n, int counter, StringBuilder s) {
        for (int i = 0; i < n - counter; i++) {
            //System.out.print(n - i);
            s.append(String.valueOf((n - i)));
        }
        counter++;
        //System.out.println();
        if (counter < n) {
            s.append("\n");
            repeat(n, counter, s);
        }
        return s.toString();
    }

}
