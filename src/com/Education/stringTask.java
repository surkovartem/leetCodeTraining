package com.Education;

import java.util.HashMap;

public class stringTask {
    /*
         LeetCode Task 13. Roman to Integer
    */
    public static int romanToInt(String s) {
        int result = 0;
        int prev = 0;

        HashMap<String, Integer> dictRoman = new HashMap<>();
        dictRoman.put("I", 1);
        dictRoman.put("V", 5);
        dictRoman.put("X", 10);
        dictRoman.put("L", 50);
        dictRoman.put("C", 100);
        dictRoman.put("D", 500);
        dictRoman.put("M", 1000);

        for(int i = s.length()-1; i >= 0; i--){
            int cur = dictRoman.get(Character.valueOf(s.charAt(i)).toString());
            if (cur < prev) result -= cur;
            else result += cur;
            prev = cur;
        }
        return result;
    }
}
