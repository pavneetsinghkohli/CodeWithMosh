package com.moshcoder;


import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        String value = list.get(0);

        System.out.println(list + value);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(3);
        list2.addElement(4);
        Integer number = list2.get(0);
        System.out.println(list2 + " " + number);

    }


    private static class MyCustomList<T> {
        ArrayList<T> list = new ArrayList<>();

        public void addElement(T element) {
            list.add(element);
        }

        public String toString() {
            return list.toString();
        }

        public T get(int index) {
            return list.get(index);
        }
    }
}
