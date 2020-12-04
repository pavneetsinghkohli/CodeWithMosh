package com.moshcoder;



public class Pattern4 {

    public static void main(String[] args) {
        System.out.println(pattern(2));
    }

    private static String pattern(int n) {
        StringBuilder sb = new StringBuilder("");

        return repeat(n, 0, sb);
    }


    private static String repeat(int n, int counter, StringBuilder sb) {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < n - counter; i++) {
            s.insert(0, String.valueOf((n - i)));
        }
        counter++;
        if(counter!=n)s.append("\n");
        if (counter <= n) {
            sb.append(s);
            repeat(n, counter, sb);
        }
        return sb.toString();
    }

}