package com.Education;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        //LeetCode Task 13. Roman to Integer
        String task13Str = "MCMXCIV";
        out.println("LeetCode Task 13. Roman to Integer:\n" + stringTask.romanToInt(task13Str) + "\n");

        //LeetCode Task 2114. Maximum Number of Words Found in Sentences
        String[] task2114Str = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        out.println("LeetCode Task 2114. Maximum Number of Words Found in Sentences:\n" + stringTask.mostWordsFound(task2114Str) + "\n");

        //LeetCode Task 1859. Sorting the Sentence
        String task1859Str = "is2 sentence4 This1 a3";
        out.println("LeetCode Task 1859. Sorting the Sentence:\n" + task1859Str + "\n" + stringTask.sortSentence(task1859Str) + "\n");

        //LeetCode Task 1108. Defanging an IP Address
        String task1108 = "1.1.1.1";
        out.println("LeetCode Task 1108. Defanging an IP Address:\n" + stringTask.defangIPaddr(task1108) + "\n");
     }
}
