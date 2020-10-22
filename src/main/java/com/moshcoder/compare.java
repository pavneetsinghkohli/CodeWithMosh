package com.moshcoder;

import java.util.Comparator;

public class compare  {

    public static void main(String[] args) {

        System.out.println(compare(2,5));
    }
        public static int compare(int x, int y) {
            return (x < y) ? -1 : ((x == y) ? 0 : 1);
        }

}
