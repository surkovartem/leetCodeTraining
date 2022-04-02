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

    /*
        LeetCode Task 2114. Maximum Number of Words Found in Sentences
    */
    public static int mostWordsFound(String[] sentences){
        int maxLetter = 0;
        for (String s: sentences){
            maxLetter = Math.max(s.split(" ").length, maxLetter);
        }
        return maxLetter;
    }

    /*
        LeetCode Task 1859. Sorting the Sentence
    */
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] shuffledWords = new String[words.length];
        for(int i = 0; i < words.length; i++){
            int index = Integer.parseInt(words[i].substring(words[i].length()-1));
            shuffledWords[index - 1] =
                    words[i] == null || words[i].length() == 0 ? (words[i] = null) : (words[i] = words[i].substring(0, words[i].length() - 1));
        }
        return String.join(" ", shuffledWords);
    }
}
