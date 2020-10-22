package com.moshcoder;

import java.util.Arrays;

public class DupArray {//Refer number 16
    public static void main(String[] args) {
        int nums[] = {20, 20, 30, 40, 50, 50, 50};
        System.out.println(Arrays.toString(dupArray(nums)));
    }

    private static int[] dupArray(int[] arr) {
        int temp = arr.length-1;
        for (int i = 0; i < temp; i++) {
            if(arr[i]==arr[i+1]){

                System.out.println("Duplicate " + arr[i] + "temp value " + temp);
                arr[i] = arr[arr.length-1];
                temp--;
                i--;
            }

        }

        for (int i = 0; i < temp; i++) {
            System.out.println(arr[i]);
        }

        return arr;
    }
}
