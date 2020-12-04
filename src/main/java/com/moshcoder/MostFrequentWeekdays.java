package com.moshcoder;


import java.text.DateFormatSymbols;
import java.util.*;

public class MostFrequentWeekdays {
    public static void main(String[] args) {

        mostFrequentDays(3068);

    }

    public static String[] mostFrequentDays(int year){
        Calendar startCal = Calendar.getInstance(Locale.US);
        startCal.set(year, 0, 1, 0, 0);

        System.out.println(" Start Date : " + startCal.getTime());

        Calendar endCal = Calendar.getInstance();
        endCal.set(year, 11, 31, 23, 1);

        String[] test = getKeysFromValue(getWorkingDaysBetweenTwoDates(startCal,endCal), 53);
        System.out.println(Arrays.toString(test));
        return test;
    }

    public static HashMap getWorkingDaysBetweenTwoDates(Calendar startCal, Calendar endCal) {
        HashMap<Integer, Integer> daysOfWeek = new HashMap<>();
        daysOfWeek.put(0, 0);
        daysOfWeek.put(1, 0);
        daysOfWeek.put(2, 0);
        daysOfWeek.put(3, 0);
        daysOfWeek.put(4, 0);
        daysOfWeek.put(5, 0);
        daysOfWeek.put(6, 0);
        daysOfWeek.put(7, 0);
        startCal.setFirstDayOfWeek(startCal.MONDAY);
        endCal.setFirstDayOfWeek(Calendar.MONDAY);
        //System.out.println(Locale.setDefault(Locale.lookup()) + ": " + startCal.getFirstDayOfWeek());
        //System.out.println("Checking first day of week " + Calendar.getInstance(Locale.US));

        do {

            daysOfWeek.put((startCal.get(Calendar.DAY_OF_WEEK)-1), (daysOfWeek.get((startCal.get(Calendar.DAY_OF_WEEK)-1)))+1);
            startCal.add(Calendar.DAY_OF_MONTH, 1);

        } while (startCal.getTimeInMillis() < endCal.getTimeInMillis());
        System.out.println(daysOfWeek);

        return daysOfWeek;
    }

    public static String[] getKeysFromValue(Map<Integer, Integer> hm, Integer value){
        List <Integer> list = new ArrayList<>();
        for(Integer o:hm.keySet()){
            if(hm.get(o).equals(value)) {
                list.add(o);
            }
        }
        System.out.println(list);
        //String[] week_days = new DateFormatSymbols().getWeekdays();
        HashMap<Integer, String> dayNamesOfWeek = new HashMap<>(Map.of(1, "Monday", 2, "Tuesday", 3, "Wednesday", 4,"Thursday", 5,"Friday", 6,"Saturday",0, "Sunday"));
        System.out.println(dayNamesOfWeek);
        String[] finalResult = new String[list.size()];

        int i = 0;
        for(int l : list){
            finalResult[i] = dayNamesOfWeek.get(l);
            i++;
            //System.out.println("list ki value L " + l);
        }
        if(finalResult.length >1 && finalResult[0] != "Wednesday" && finalResult[0] != "Thursday"){
            Arrays.sort(finalResult);
        }

        System.out.println("Final Result value " + Arrays.toString(finalResult));

        return finalResult;
    }



}

