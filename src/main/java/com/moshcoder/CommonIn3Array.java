package com.moshcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonIn3Array {
    public static void main(String[] args) {

        int array1[] = {2, 4, 8, 40};
        Integer array2[] = {0,0,1,0,3,0,5,0,6,0,0};
        int array3[] = {4, 8, 14, 40};

        System.out.println(common(array1, array2, array3));
        System.out.println(zero(array2));

    }

    public static ArrayList<Integer> zero(Integer[] a2) {
        ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(a2));
        System.out.println(" myList : " + newList);

        for (int i = newList.size()-1; i >= 0; i--) {
            if(newList.get(i) == 0){
                newList.remove(i);
                newList.add(newList.size(), 0 );
            }
        }

        return newList;
    }


    public static ArrayList<Integer> common(int[] a1, Integer[] a2, int[] a3) {
        ArrayList<Integer> common = new ArrayList<>();
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                for (int k = 0; k < a3.length; k++) {
                    if (a1[i] == a2[j] && a3[k] == a2[j]) {
                        common.add(a1[i]);
                    }

                }

            }

        }
        return common;
    }

}
