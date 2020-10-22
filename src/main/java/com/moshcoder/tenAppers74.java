package com.moshcoder;

public class tenAppers74 {
    public static void main(String[] args) {
        int[] arrays = {10, 2, 4};

        System.out.println(arrays.length);
        boolean result = false;
        if (arrays.length > 2) {
            if ((arrays[0] == 10) || (arrays[arrays.length - 1] == 10)) {
                result = true;
            }
        }

            System.out.println(result);


        }
    }
