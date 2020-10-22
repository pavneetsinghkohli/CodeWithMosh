package com.moshcoder;

public class Unique3DigitNumbers39 {

    public static void main(String[] args) {
        /*
        1. take x digits
        2. each index level, ask for next digits which not repeated
            1. for loop at Top level will take many inputs
            2. for loop at 1st level to pick indexes and match
            3. ensure not repeated
        3. sysout
         */
int amount = 0;
int x = 7;
int ch = 'z';

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                for (int k = 1; k <= x; k++) {
                    //System.out.println("Check" + i + " " + j +" " + k);
                    if(i != k && i != j && j != k){
                        amount++;
                        System.out.println("" + i + " " + j +" " + k);
                    }

                }

            }
            
        }
        System.out.println(amount);
        System.out.println("value :"+ch);

    }
}
