package org.leetcode.grind75.program3.mergesortedlist;


/*Definition for singly-linked list.*/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Solution {
    public static void main(String[] args) {
        int[]  arr1 = {1,2,4};
        int[]  arr2 = {1,3,4};
        ListNode l1 = new ListNode();
        ListNode list1 = l1;
        for(int i =0;i<arr1.length;i++){
            l1.next = new ListNode(arr1[i]);
            System.out.print(arr1[i]+" ");
            l1 = l1.next;
        }
        System.out.print("\n");
        ListNode l2 = new ListNode();
        ListNode list2 = l2;
        for(int i =0;i<arr2.length;i++){
            l2.next = new ListNode(arr2[i]);
            System.out.print(arr2[i]+" ");
            l2 = l2.next;
        }
        System.out.print("\n");
        ListNode list = new Solution().mergeTwoLists(list1.next, list2.next);
        while (list != null) {
            System.out.print(list.val+" ");
            list = list.next;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode(-1);
        ListNode head = list;
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    list.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    list.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                list.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                list.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            list = list.next;
        }
        return head.next;
    }

}