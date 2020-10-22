package com.moshcoder;

public class oddNumber48 {
    public static void main(String[] args) {
        /*
        1. range 1-99
        2. println for the looop
        3. %2
         */
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if(i%2 != 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
        System.out.println(checkNumber(20));
    }

    public static int checkNumber(int number){
        if(number % 2 == 0) {
            return 1;
        }else
            return 0;
    }

}
