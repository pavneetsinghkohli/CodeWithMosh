package com.moshcoder;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.*;

public class Strings {
    private static Object StringBuffer;

    public static void main(String[] args) {
        String str = "Java Exercises! 1 ";
        String str1 = "Java Exercises! 2";
        System.out.println(str.codePointCount(1, 5));
        System.out.println("The character at position 0 is " + str.charAt(0));
        System.out.println("The character at position 10 is " + str.charAt(10));
        System.out.println("The character at position 10 is " + str.codePointAt(0));
        Integer result = str.compareTo(str1);
        System.out.println(result);
        if (result < 0) {
            System.out.println(str + " less than " + str1);
        } else if (result == 0) {
            System.out.println(str + " eques to " + str1);
        } else {
            System.out.println(str + " greater than " + str1);

        }
        System.out.println(str.concat(str1));

        System.out.println(str.contains("Java"));
        System.out.println(str.contentEquals("Java Exercises! 1 "));

        char[] arr_num = new char[]{'1', '2', '3', '4'};

        StringBuffer stringBuffer = new StringBuffer(String.valueOf(arr_num));

        System.out.println(stringBuffer);

        stringBuffer.setCharAt(0, 'Y');
        System.out.println(stringBuffer);
        String s = String.copyValueOf(arr_num, 0, 4);
        System.out.println(s);

        String newString = String.valueOf(StringBuffer);
        System.out.println(newString);

        String str3 = "Python Exercises";
        String str2 = "Python Exercise";

        System.out.println(str3.endsWith("se"));
        System.out.println(str2.endsWith("se"));

        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "stephen edwin king";

        System.out.println(columnist1.compareToIgnoreCase(columnist3));
        if (columnist1.compareToIgnoreCase(columnist2) == 0) {
            System.out.println("True");
        } else System.out.println("False");

        System.out.println(columnist1.equalsIgnoreCase(columnist3)
        );

        System.out.println(System.nanoTime()
        );
        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.println(c.getTime());
        System.out.println(c.get(c.WEEK_OF_YEAR));

        test();
        Strings s1 = new Strings();

        String v = "Varun";

        String.copyValueOf(v.toCharArray());

        /*char
        int
        long
        byte
        short
        float
        double //premitive data type. all from short - when don't want to store...they don't have myBap Object...
                Integer
        Long
                Byte

        Short
                Float

        Double
                Character

        ArrayList<String> al = new ArrayList<>();
        ArrayList<Integer> alInt = new ArrayList<>();
*/
// create Formatter class object
        Formatter formatter = new Formatter();

        // Use Space format specifier
        formatter.format("% d", -111);
        System.out.println(formatter);

        //formatter = new Formatter();
        formatter.format("%, d", 1111111);
        System.out.println(formatter);

        //formatter = new Formatter();
        formatter.format("% d", -222);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("% d", 222);
        System.out.println(formatter);

        long n = 461012;
        System.out.format("%d%n", n);      //  -->  "461012"
        System.out.format("%08d%n", n);    //  -->  "00461012"
        System.out.format("%+8d%n", n);    //  -->  " +461012"
        System.out.format("%,8d%n", n);    // -->  " 461,012"
        System.out.format("%+,8d%n%n", n); //  -->  "+461,012"

        double pi = Math.PI;

        System.out.format("%f%n", pi);       // -->  "3.141593"
        System.out.format("%.3f%n", pi);     // -->  "3.142"
        System.out.format("%10.3f%n", pi);   // -->  "     3.142"
        System.out.format("%-10.3f%n", pi);  // -->  "3.142"
        System.out.format(Locale.FRANCE,
                "%-10.4f%n%n", pi); // -->  "3,1416"
        //https://docs.oracle.com/javase/tutorial/java/data/numberformat.html#:~:text=System.out.format(%22,args%20%2C%20are%20to%20be%20formatted.


        Calendar cal = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", cal, cal, cal); // -->  "May 29, 2006"

        System.out.format("%tl:%tM %tp%n", cal, cal, cal);  // -->  "2:34 am"

        System.out.format("%tD%n", cal);    // -->  "05/29/06"

        String str20 = "test is always better";
        byte new_byte[] = str20.getBytes();
        System.out.println(str + Arrays.toString(new_byte));
        String new_string = new String(new_byte);
        System.out.println(new_string);


        char arr[] = new char[]{ 'a', ' ', ' ', ' ',
                ' ', ' ', ' ', ' ' };

        str20.getChars(0, 2, arr, 3);

        System.out.println(str20.intern());

        System.out.println(str20.indexOf("t", 2));

        Boolean check = str1.regionMatches(0, str20, 2, 9);

        System.out.println(check);

    }



    public static void test() {
        System.out.println("Testing is done");
    }


}
