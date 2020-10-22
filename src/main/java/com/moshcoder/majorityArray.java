package com.moshcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class majorityArray {
    public static void main(String[] args) {
        int[] array = {10, 9, 14, 23, 15, 0, 9};
        int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0};
        findMajority(array);
        System.out.println(separateZerostoOne(nums));
    }

    private static ArrayList separateZerostoOne(int[] nums) {
        int s = nums.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < s; i++) {
            al.add(nums[i]);
        }
        System.out.println();
        System.out.println(al.toString());
        for (int i = 0; i < al.size()-1; i++) {
            if(al.get(i)==1){
                al.add(1);
                al.remove(al.get(i));
            }
        }
        return al;
    }

    private static void findMajority(int[] array) {
        int size = array.length;
        System.out.print("Majority found as : ");
        for (int i = 0; i < size ; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if(array[i] <= array[j]) {
                    break;
                }
            }
            if(j == size){

                System.out.print(array[i] + " ");
            }

        }
    }
}
