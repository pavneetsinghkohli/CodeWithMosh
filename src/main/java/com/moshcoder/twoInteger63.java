package com.moshcoder;

public class twoInteger63 {
    public static void main(String[] args) {
        /*
        1. 2 integers
        2. check0 - return the larger value
        check1- same return 0 if equal
        3. check 3- return the smaller value if they are divisible by 6 but same remainder

         */
        System.out.println(result(6,18));
    }
    public static int result(int x, int y)
    {
        if(x == y)
            return 0;
        if(x % 6 == y % 6)
            return (x < y) ? x : y;
        return (x > y) ? x : y;
    }

}
/*
    public static int bigValue(int x, int y) {
        if (x < y) return y;
        return x;
    }

    public static int sameValue(int x, int y) {
        if (x == y) return 0;
        if (x % 6 == y % 6) return (x + y - bigValue(x, y));
        if (x < y) return y;
        return x;
    }

 */