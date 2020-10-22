package com.moshcoder;

import java.io.File;
import java.util.Date;

public class fileSize45 {

    public static void main(String[] args) {

        File f = new File("/Users/pasin16/newsoim");
        Date date = new Date();

        System.out.println(date.toString());

        System.out.format("%tc%n 2nd \n", System.currentTimeMillis());
        System.out.format("lenght of file /Users/pasin16/newsoim/code_notes/history.txt " + f.list() + " bytes");

    }
}
