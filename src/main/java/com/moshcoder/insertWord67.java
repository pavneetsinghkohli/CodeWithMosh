package com.moshcoder;

public class insertWord67 {
    public static void main(String[] args) {
        String x = "Python 3.0";
        String y = "Tutorial";

        System.out.println(x.substring(0,7) + y + x.substring(6));



            String str1 = "Python";
            String str2 = "we";

            int length2 = str2.length();
            String result = "";
            result += (str1.length() >= 1) ? str1.charAt(0) : '#';
            result += (length2 >= 1) ? str2.charAt(length2-1) : '#';
            System.out.println(result);

    }
}
