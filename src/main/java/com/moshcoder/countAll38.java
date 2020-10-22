package com.moshcoder;

import java.util.Arrays;

public class countAll38 {

    public static void main(String[] args) {
    /*
    1. Input String to find elements
    2. make char array
    3. separate letter, space, number and others¨
    4. count them and return
            each

        String s = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        int letters = 0, spaces = 0, numbers=0, others = 0;
        for(int i=0;i <s.length(); i++){
            char c = s.charAt(i);
            if((c >= 'a' && c<= 'z') || (c >= 'A' && c<= 'Z') ){
                letters ++;
            }else if(c >= '0' && c<= '9'){
                numbers ++;
            }else if(c == ' '){
                spaces ++;
            }else{
                others ++;
            }



            int[] array_nums = {5, 7};
            System.out.println("Original Array: "+ Arrays.toString(array_nums));
            System.out.println(array_nums[0] == 4 || array_nums[0] == 7 || array_nums[1] == 4 || array_nums[1] == 7);
*/
        int[] a = {20, 30, 40};
        int[] b = new int[3];
        int x = 0;
        for (int i = a.length-1; i >= 0; i--) {
            b[x] = a[i];
            x++;
        }
        System.out.println("b + " +Arrays.toString(b));


        String s = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        System.out.println("check"+s.startsWith("Aa"));
        int letters = 0, spaces = 0, numbers = 0, others = 0;
        char[] sA = s.toCharArray();
        //System.out.println(sA);
        for(int i=0;i <sA.length; i++){
            if (Character.isDigit(sA[i])) {
                numbers++;
            }else if (Character.isSpaceChar(sA[i])) {
                spaces++;
            }else if (Character.isAlphabetic(sA[i])) {
                letters++;
            }else {
                others++;
            }

        }
        System.out.println(" Letters : " + letters + "\n Spaces : " + spaces+ "\n Numbers : " + numbers + "\n Others : " + others  );
    }


}
