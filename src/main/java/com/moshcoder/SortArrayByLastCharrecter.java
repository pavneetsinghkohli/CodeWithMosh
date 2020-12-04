package com.moshcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayByLastCharrecter {
    public static void main(String[] args) {
        String[] array = new String[]{"acvd", "bcc", "rca", "sup1", "12", "11"};

        System.out.println(Arrays.toString(sortMe(array)));
    }

    private static String[] sortMe(String[] array) {
        char[] arr = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i].charAt(array[i].length() - 1);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (arr[j] < arr[i]) {
                    char t = arr[i];
                    String t1 = array[i];
                    arr[i] = arr[j];
                    array[i] = array[j];
                    arr[j] = t;
                    array[j] = t1;
                }

            }

        }
        return array;
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


    public static void main(String[] args) {
        //List<Object> array = new ArrayList<>(List.of("acvd", "bcc", "rca", "sup1", 12, "11"));
        String[] array = new String[]{"acvd", "bcc", "rca", "sup1", "12", "11"};

        System.out.println(array);
        System.out.println(Arrays.toString(sortMe(array)));
    }

    private static String[] sortMe(String[] array) {
        char[] arr = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i].charAt(array[i].length() - 1);
            System.out.println(arr[i]);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (arr[j] < arr[i]) {
                    char t = arr[i];
                    String t1 = array[i];
                    arr[i] = arr[j];
                    array[i] = array[j];
                    arr[j] = t;
                    array[j] = t1;
                }

            }

        }
        return array;
    }


        //String[] array = new String[]{"acvd", "bcc", "rca", "sup1", "12", "11"};

        System.out.println(array);
        System.out.println(sortMe(array));
    }

    private static List<Object> sortMe(List<Object> array) {
        char[] arr = new char[array.size()];
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) instanceof String){
                arr[i] = ((String) array.get(i)).charAt(((String) array.get(i)).length() - 1);
                System.out.println("Printing Str for Char " + arr[i]);

            }else {
                arr[i] = (char) (((Integer) array.get(i)) % 10);
                System.out.println("Printing Int for Char " + arr[i]);
            }

            System.out.println(arr[i]);
        }


        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (arr[j] < arr[i]) {
                    char t = arr[i];
                    String t1 = (String) array.get(i);
                    arr[i] = arr[j];
                    array[i] = array[j];
                    arr[j] = t;
                    array[j] = t1;
                }

            }

        }
        System.out.println(arr);
        return array;
    }
}
}*/
