package com.moshcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparteEvenVsOdd {
    public static void main(String[] args) {
        /*
    1. initiate 2 arraylists
    2. identify the even and odd and save them into 2 distinct arrays
    3. mergre the arrays
    */
        int nums1[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        int nums[] = {45, 20, 100, 23, -5, 2, -6};
        /*
        * compare left to right
        * if find greatest, replace it with it..
        * last one with -1

    */

        System.out.println(newArrayEvenOdd(nums1));
        System.out.println(Arrays.toString(greatestElement(nums)));

    }

    private static int[] greatestElement(int[] nums) {
        System.out.println("greatestElement " + Arrays.toString(nums));
        int greatest = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] < nums[j]){
                    greatest = nums[j];
                    System.out.println(greatest);
                }
                }
            nums[i] = greatest;
            if(nums[i] == nums[nums.length -1]){
                nums[nums.length -1] = -1;
            }

        }return nums;
    }
//[100, 100, 23, 2, 2, -6, -1]

    private static ArrayList<Integer> newArrayEvenOdd(int[] nums) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                evenList.add(nums[i]);
            }else{
                oddList.add(nums[i]);

            }


        } System.out.println("even " + evenList );
        System.out.println("odd " + oddList );
        evenList.addAll(oddList);
        return evenList;

    }


}
