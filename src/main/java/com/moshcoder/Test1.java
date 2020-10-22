package com.moshcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {


        int arr[] = {10, 9, 14, 23, 15, 0, 9};
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j]) {

                    System.out.print(arr[i] + " i");
                    System.out.println();
                    System.out.print(arr[j] + " j");

                }

            }
        }
    }
}