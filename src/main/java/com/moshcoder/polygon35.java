package com.moshcoder;

import java.util.Scanner;

public class polygon35 {


    public static void main(String[] args) {
        System.out.print("input the length of the side : " );
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        System.out.print("input the number of sides : " );
        int n = in.nextInt();
        System.out.println("\n" + "The area o is: " + area(s, n));
    }

    public static double area(int s, int n){
        return (n*(s*s))/(4*Math.tan(Math.PI/n));
    }
}
