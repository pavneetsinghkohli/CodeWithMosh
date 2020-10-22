package com.moshcoder;

public class reverseString37 {

    public static void main(String[] args) {

        String s = "The quick brown fox";
        char[] arrays = s.toCharArray();

        System.out.println(reverse(arrays));


    }

    /*
    1. Input string or given a string
    2. convert it to char array
    3. read from last index
        1. create a new empty array
        2. add indexes by i-- in new array
     */

    public static String reverse(char[] arrays){
        String newArray = "";
        for(int i = arrays.length-1; i >= 0 ; i--){
            //System.out.print(arrays[i]); this also works.
            newArray += arrays[i];

        }
        return newArray;
    }

}
