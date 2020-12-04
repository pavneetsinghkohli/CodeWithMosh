package com.moshcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class FlattenAndSortArray {
    public static void main(String[] args) {
        int[][] array = {{3, 2, 1}, {4, 6, 5}, {}, {9, 7, 8}};

        System.out.println(Arrays.toString(flattenAndSort(array)));
    }

    private static int[] flattenAndSort(int[][] array) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i]);
            for (int j = 0; j < array[i].length; j++) {
                newArray.add(array[i][j]);

            }

        }
        int[] arr = new int[newArray.size()];
        for (int i = 0; i < newArray.size(); i++) {
            arr[i] = newArray.get(i);

        }
        Arrays.sort(arr);
        return arr;
    }
}

