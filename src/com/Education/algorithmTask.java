package com.Education;

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
    public static StringBuilder stringBuilder;
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
}
