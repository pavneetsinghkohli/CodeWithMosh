package com.moshcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayAvg {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList(List.of("Ram", "Sham"));
        //

        int[] my_array = {25, 14, 13, 13, 56, 15, 36, 56, 77, 18, 29, 29};
        int[] is = {3, 4, 5, 7, 9, 14, 55};
        System.out.println("Original Array = " + "\n" + Arrays.toString(is));
        System.out.println(Arrays.toString(reverseArray(is)));


        // Insert an element in 3rd position of the array (index->2, value->5)

        int Index_position = 2;
        int newValue = 5;


        System.out.println(totalSum(is) / is.length);
        System.out.println(contains(arrayList, "Sham"));
        System.out.println("new Array Created " + Arrays.toString(newArray(is)));
        System.out.println("new Array with added value " + Arrays.toString(addValue(my_array, Index_position, newValue)));

        maxValue(my_array);

        System.out.println("new Array Duplicates " + Arrays.toString(duplicateValues(my_array)));

    }

    public static int[] duplicateValues(int[] array) {
        int[] newA = new int[array.length];
        int temp = 0;
        System.out.println("array for duplicate " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if((array[i] == array[j]) && (i != j)){
                    System.out.println("printing duplicate " + array[j]);
                    newA[i] = array[j];
                }
            }
        }
        return newA;

    }


    //{3, 4, 5, 7, 9, 14, 55};
    public static int[] reverseArray(int[] array) {
        int[] newA = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            newA[6 - i] = array[i];
        }
        return newA;
    }

    public static void maxValue(int[] array) {
        int maxValue = 0;
        int minValue = 99;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxValue) {
                maxValue = array[i];
            }

            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("MaxValue  " + maxValue + " MinValue " + minValue);
    }

    public static int[] addValue(int[] my_array, int index_position, int newValue) {
        for (int i = my_array.length - 1; i > index_position; i--) {
            my_array[i] = my_array[i - 1];
        }
        my_array[index_position] = newValue;
        return my_array;
    }

    public static double totalSum(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static Boolean contains(ArrayList list, String text) {
        return list.contains(text);
    }

    public static int[] newArray(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }


}
