package com.moshcoder;



import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;


public class Lists {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "red", "yo");
        System.out.println(list);

        for( int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


        for(String l:list){
            System.out.println(l);
        }

        System.out.println(list.iterator().hasNext());
        Iterator listIterator = list.iterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        List inte = List.of(1,2,3,4);
        System.out.println(inte);

        ArrayList<Integer> inteArrayList = new ArrayList<>(inte);

        System.out.println(inteArrayList);

        for (Integer integer : inteArrayList) {
            System.out.println(integer);

        }





    }
}
