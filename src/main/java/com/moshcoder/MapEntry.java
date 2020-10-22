package com.moshcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Arrays;

public class MapEntry {
    public static void main(String[] args) {


        // Array - test majority element
        int nums[] = {1, 6, 6, 5, 6, 6, 6, 7, 3};
        System.out.println("Original Array : " + Arrays.toString(nums));
        int result = MajorityElemen(nums);
        if (result != -1)
            System.out.println("Majority element is " + result);
        else
            System.out.println("Majority element does not exist");
    }

    private static int MajorityElemen(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        System.out.println(n);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
        }
        System.out.println("value null " + map);

        for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
            System.out.println(ent);
            if (ent.getValue() > n / 2){
                return ent.getKey();
            }
        }

        return -1;
    }


    public static int MajorityElement(int arra1[]) {
        int n = arra1.length;

        // Hash Map
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // Element's frequency in a map
        for (int i = 0; i < n; i++) {
            if (map.get(arra1[i]) == null)

                map.put(arra1[i], 0);
            map.put(arra1[i], map.get(arra1[i]) + 1);

        }

        // Return the element if its count is more than n/2
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if ((int) pair.getValue() > n / 2)
                return (int) pair.getKey();

        }

        // no majority element
        return -1;
    }
}

