package com.moshcoder;

import java.util.HashMap;

public class Numericals_String {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(numerical(s));
    }

    private static String numerical(String s) {
        StringBuilder newString = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] cArray = s.toCharArray();

        for (char c: cArray) {
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
            newString.append(map.get(c));
        }

        return newString.toString();
    }


}
