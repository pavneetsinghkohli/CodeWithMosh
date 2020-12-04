package com.moshcoder;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.TreeMultimap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortArrayByProductValueIndex {
    public static void main(String[] args) {
        int[] array = {73, 69, 43, 15, 10, 27, 58, 66, 10};
        System.out.println(Arrays.toString(sortByValueAndIndex(array)));

        /*String key = "a-key";
        Multimap<String, String> map = TreeMultimap.create();

        map.put(key, "firstValue");
        map.put(key, "secondValue");
        map.put(key, "second2Value");
        map.put(key, "first1Value");
        map.put("b-key", "secondV3alue");

        for(Map.Entry<String,String> entry : map.entries()){
            System.out.println(entry.getKey() + entry.getValue());

        }



        System.out.println("printing treemap " + map);

        assertEquals(2, map.size());*/
    }

    private static void assertEquals(int i, int size) {
        System.out.println(size);
    }


    private static int[] sortByValueAndIndex(int[] array) {
        int[] value = new int[array.length];
        int counter = 0;
        Multimap<Integer, Integer> tm = TreeMultimap.create();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                tm.put(array[i] * (i + 1) + counter, array[i]);
                counter++;
            } else {
                tm.put(array[i] * (i + 1), array[i]);
            }
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : tm.entries()) {
            value[i++] = entry.getValue();
        }
        return value;
    }


}

/*
import java.util.Arrays;
public class Kata
{
    public static int[] sortByValueAndIndex(int[] array)
    {
        int[] arr = new int[array.length];
        for (int i=0; i<array.length; i++){
            arr[i]=array[i]*(i+1);
        }
        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if (arr[j]<arr[i] ){
                    int t=arr[i]; int t1=array[i];
                    arr[i]=arr[j]; array[i]=array[j];
                    arr[j]=t;  array[j]=t1;
                }
            }
        }
        return array;
    }
}*/

