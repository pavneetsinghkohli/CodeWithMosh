package com.moshcoder;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class SumOfTwoIntegersWithoutPlus {
    public static void main(String[] args) {

        int x = -5, y = 19;
        System.out.println(add1(x,y));
    }

    private static int add(int x, int y) {
        LongAdder count = new LongAdder() ;
            count.add(x);
            count.add(y);

        int newCount = Integer.parseInt(String.valueOf(count));
        return newCount;
    }

    /* https://www.youtube.com/watch?v=qq64FrA2UXQ
        1. these are bitwise operators to work with binary objects where & is like && - where it
        calculates values only when both are same 1 and 1 = 1 but if either of them is 1 and 0 , it will be 0.
            Also to be noted for this problem, and since the behaviour of And, it will help us knowing where is the carry - since
            we cannot use the simple + , s we have 3 factors, 1. where is the carry i.e and, 2, actual sum of values i.e. ^, 3. shifting
            them to the left i.e. << so that before we do the ^ XOR again we shift the 1 to the left.
        2. ^ is Exclusive Or or called XOR - it works as OR in binary - where either 1 and 0 is 1 then it gives 1, but
        if both are 1 and 1 then it does the exception and gives 0
        3. << does shifts things to left, since in our activity we need to have the cary to the next bit, we use this to
        shift the bits to the left.
         */

    private static int add1(int x, int y) {
        // do all the below operations unless we have nothing to carry and all are 000s.
        while (y != 0)
    {
        //find where is the carry and save it into the carry.
        int carry = x & y;
        //do the actual plus with XOR and save it in x.
        x = x ^ y;
        //move all 1ns to the left and save them into y.
        y = carry << 1;
    }
        return x;
}
}




//int count = 0;
        /*if(x<0){
            for (int i = x; i < 0; i.increment()) {
                count.decrementAndGet();
            }
        }else{
            for (int i = 0; i < x; i++) {
                count.incrementAndGet();
            }
        }
        if(y<0){
            for (int i = y; i < 0; i++) {
                count.decrementAndGet();
            }
        }else{
            for (int i = 0; i < y; i++) {
                count.incrementAndGet();
            }
        }*/