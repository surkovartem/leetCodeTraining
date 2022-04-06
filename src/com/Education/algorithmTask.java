package com.Education;

import java.lang.reflect.Array;
import java.util.*;

public class algorithmTask {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode next){ this.val = val; this.next = next; }

    }

    //for print to test
    public static void printListNode(ListNode listNode){
        if (listNode != null){
            System.out.print("[" + listNode.val + "] ");
            printListNode(listNode.next);
        }
    }

    //for print into main.java
    public static StringBuilder stringBuilder = new StringBuilder();
    public static String listNodeToString(ListNode listNode){
        if (listNode != null){
            stringBuilder.append("[").append(listNode.val).append("]");
            listNodeToString(listNode.next);
        }
        return stringBuilder.toString();
    }

    /*
        LeetCode Task 21. Merge Two Sorted Lists
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode parth = new ListNode();
        ListNode tail = parth;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = list1 != null ? list1 : list2;
        return parth.next;
    }

    /*
        LeetCode Task1. Two sum
     */
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if (map.containsKey(temp) && map.get(temp) != i){
                return new int[] {map.get(temp), i};
            }
        }
        return null;
    }

    public static String arrayToString(int[] arr){
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < arr.length; i++){
            result.append("[" + arr[i] + "]");
        }
        return result.toString();
    }

    /*
        LeetCode Task 1929. Concatenation of Array
     */
    public static int[] getConcatenation(int[] arr){
        int[] result = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++){
            result[i] = arr[i];
            result[i+arr.length] = arr[i];
        }
        return result;
    }
}