package com.Education;
import java.util.LinkedList;
import java.util.Objects;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        //LeetCode Tasks String
        out.println("[LEETCODE TASKS STRING]");
        //LeetCode Task 13. Roman to Integer
        String task13Str = "MCMXCIV";
        out.println("\tLeetCode Task 13. Roman to Integer: " + stringTask.romanToInt(task13Str) + "\n");

        //LeetCode Task 2114. Maximum Number of Words Found in Sentences
        String[] task2114Str = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        out.println("\tLeetCode Task 2114. Maximum Number of Words Found in Sentences: " + stringTask.mostWordsFound(task2114Str) + "\n");

        //LeetCode Task 1859. Sorting the Sentence
        String task1859Str = "is2 sentence4 This1 a3";
        out.println("\tLeetCode Task 1859. Sorting the Sentence: " + task1859Str + " -> " + stringTask.sortSentence(task1859Str) + "\n");

        //LeetCode Task 1108. Defanging an IP Address
        String task1108 = "1.1.1.1";
        out.println("\tLeetCode Task 1108. Defanging an IP Address: " + task1108 + " -> " + stringTask.defangIPaddr(task1108) + "\n");

        //LeetCode Task LeetCode Task 344. Reverse String
        char[] task344 = {'h','e','l','l','o'};
        out.println("\tLeetCode Task 344. Reverse String: " + stringTask.charArrayToString(task344) + " -> "
                + stringTask.charArrayToString(stringTask.reverseString(task344)) + "\n");


        //LeetCode Tasks Algorithms
        out.println("\n[LEETCODE TASKS ALGORITHM]");
        //LeetCode Task 21. Merge Two Sorted Lists
        algorithmTask.ListNode list1Node3 = new algorithmTask.ListNode(4, null);
        algorithmTask.ListNode list1Node2 = new algorithmTask.ListNode(2, list1Node3);
        algorithmTask.ListNode list1Node1 = new algorithmTask.ListNode(1, list1Node2);

        algorithmTask.ListNode list2Node3 = new algorithmTask.ListNode(4, null);
        algorithmTask.ListNode list2Node2 = new algorithmTask.ListNode(3, list2Node3);
        algorithmTask.ListNode list2Node1 = new algorithmTask.ListNode(1, list2Node2);

        out.println("\tLeetCode Task 21. Merge Two Sorted Lists: "
                + algorithmTask.listNodeToString(algorithmTask.mergeTwoLists(list1Node1, list2Node1)) + "\n");
        algorithmTask.stringBuilder.setLength(0);

        //LeetCode Task 1. Two Sum
        int[] task1Nums = {2,7,11,15};
        int task1Target = 9;
        out.println("\tLeetCode Task 1. TwoSum: " + "nums = "
                + algorithmTask.arrayToString(task1Nums) + " target = " + task1Target + "\n"
                + "\tresult = " + algorithmTask.arrayToString(Objects.requireNonNull(algorithmTask.twoSum(task1Nums, task1Target))) + "\n");

        //LeetCode Task 1929. Concatenation of Array
        int[] task1929Nums = {1,2,1};
        out.println("\tLeetCode Task 1929. Concatenation of Array: " + "nums = " + algorithmTask.arrayToString(task1929Nums) + "\n\t"
                + algorithmTask.arrayToString(algorithmTask.getConcatenation(task1929Nums)) + "\n");
    }
}