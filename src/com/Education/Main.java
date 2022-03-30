package com.Education;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        //LeetCode Task 13. Roman to Integer
        String s = "MCMXCIV";
        out.println(stringTask.romanToInt(s));

        //LeetCode Task 2114. Maximum Number of Words Found in Sentences
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        out.println(stringTask.mostWordsFound(sentences));
     }
}
