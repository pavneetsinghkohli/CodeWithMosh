package com.moshcoder;

public class MatrtixAddition {
    public static void main(String[] args) {
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};
       /* for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }*/
        System.out.println(matrixAddition(a, b));
    }
    public static int[][] matrixAddition(int[][] a, int[][] b) {
        int c[][] = new int[a.length][a.length];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }
        return c;
    }
}
