package com.fan.剑指Offer.剑指Offer18删除链表的节点;

import com.fan.helpers.ListNode;

public class Solution1 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;
        ListNode prev = head,
                 cur  = head.next;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
                break;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
