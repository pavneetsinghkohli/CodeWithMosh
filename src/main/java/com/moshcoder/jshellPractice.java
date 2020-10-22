package com.moshcoder;


import java.util.*;


public class jshellPractice {
    public static void main(String[] args) {

        int[] arrays = new int[5];
        arrays[4] = 45;

        List text = List.of("1", "2");
        System.out.println(text);

        List<String> textAL = new ArrayList<>(text);
        textAL.add("Rod");
        System.out.println(textAL);

        List<Student> students = List.of(new Student(2, "Robert"),  new Student(22, "adam"), new Student(4, "Pom"));
        List<Student> studentsAL = new ArrayList<>(students);
        System.out.println(studentsAL);



        Collections.sort(studentsAL);
        //studentsAL.sort(studentsAL);


        System.out.println(studentsAL);




    }


    public static class Student implements Comparable<Student> {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString(){
            return id + " " + name;
        }

        @Override
        public int compareTo(Student that) {
            return Integer.compare(that.id, this.id);
        }
    }

}
