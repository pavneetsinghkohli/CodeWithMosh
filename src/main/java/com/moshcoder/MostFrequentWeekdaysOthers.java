package com.moshcoder;


import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Arrays;

public class MostFrequentWeekdaysOthers {
    public static void main(String[] args) {
        mostFrequentDays(3068);
    }

    public static String[] mostFrequentDays(int year) {

        LocalDate date = LocalDate.of(year, 1, 1);

        DayOfWeek day1 = date.getDayOfWeek();

        DayOfWeek day2 = day1.plus(1);

        String days = day1.toString();

        if (date.lengthOfYear() > 365) {

            if (day1.getValue() < day2.getValue()) days = day1.toString() + "," + day2.toString();

            else days = day2.toString() + "," + day1.toString();

        }

        String[] salida = days.split(",");

        for (int i = 0; i < salida.length; i++) {

            salida[i] = salida[i].charAt(0) + salida[i].substring(1).toLowerCase();
        }

        //System.out.println(Arrays.toString(salida));

        return salida;
    }

}
