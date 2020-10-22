package com.moshcoder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class dateTimeSpecificFormat47 {
    public static void main(String[] args) {

        SimpleDateFormat cdt;
        cdt = new SimpleDateFormat("yy/dd/MM HH:mm:ss.SSS");

        //here just setting the calaender with a specific time zone, however this can be commented out to get simple format changed of the current output we get from system.
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("CMT")));

        System.out.println(cdt.format(System.currentTimeMillis()));


    }


}
