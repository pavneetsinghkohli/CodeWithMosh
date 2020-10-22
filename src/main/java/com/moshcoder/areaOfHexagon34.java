package com.moshcoder;

import java.util.Scanner;

public class areaOfHexagon34 {

    public static void main(String[] args) {
        System.out.print("input the length of the side : " );
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        System.out.println("The area of the hexagon is: " + area(s));
    }

    public static double area(int s){
        return (6 * (s * s) / (4 * Math.tan(Math.PI/6)));
    }
}
