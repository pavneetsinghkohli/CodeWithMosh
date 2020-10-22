package com.moshcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicateString {

    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};

        String[] array2 = {"MySQL", "SQL", "SQLite", "SQL", "PostgreSQL", "DB2", "JAVA"};

        System.out.println(commonElements(array1, array2));
        System.out.println(dupElementRemoval(array2));
        unique_array(new int[]{-2, -2, -2, 4, 3, 2});

        System.out.println("\nsecond largest " + secondLargest(new int[]{10789, 1035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456}));

    }

    private static int secondLargest(int[] ints) {
        int max = 0;
        int second = 0;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] == max){
                second = max;
            }else if(ints[i]>max){
                second = max;
                max = ints[i];
                //If someone comes bigger then max, then only max will give up his value to second max and will take its value.
            }else if(ints[i]>second) {
                second = ints[i];
            }//to cover values lower than max and may be higher then previous value of second (when equal also)

        }
        return second;
    }


    public static void unique_array(int[] array) {

        int counter = array.length;

        for (int i = 0; i < counter; i++) {
            for (int j = i + 1; j < counter; j++) {

                if (array[i] == (array[j])) {
                    array[j] = array[counter - 1];

                    counter--;
                    j--;

                }
            }

        }
        System.out.println(Arrays.toString(array));
        int[] array1 = Arrays.copyOf(array, counter);
        for (int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i]+"\t");
        }
    }


    public static ArrayList dupElementRemoval(String[] array) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
            for (int j = i + 1; j < array.length; j++) {

                if (array[i].equals(array[j])) {
                    System.out.println("Element Found : " + array[j]);

                    list.remove(array[i]);
                }
            }

        }
        return list;
    }

    public static ArrayList commonElements(String[] array1, String[] array2) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    list.add(array2[j]);
                }
            }

        }
        return list;
    }


}

