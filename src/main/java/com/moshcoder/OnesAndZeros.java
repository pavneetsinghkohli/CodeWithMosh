package com.moshcoder;

import java.util.ArrayList;
import java.util.List;

public class OnesAndZeros {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(List.of(1,1,1,1));
        System.out.println(al);
        System.out.println(ConvertBinaryArrayToInt(al));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;
        int counter = 0;
        for (int i = binary.size() -1; i >= 0 ; i--) {

            if(binary.get(i) == 1 ){
                result += Math.pow(2, counter);
            }
            counter++;
        }
        /*if(binary.get(binary.size() - 1) == 1){
            result++;
        }*/

        return result;
    }

}
