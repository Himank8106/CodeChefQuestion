/* Link - https://www.interviewbit.com/problems/reverse-link-list-ii/ */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if (A == null || A.next == null || B == C) {
            return A;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = A;
        ListNode prev = dummy;
        int count = 1;
        while (count < B) {
            prev = prev.next;
            count++;
        }
        ListNode curr = prev.next;
        ListNode after = null;
        while (count < C) {
            after = curr.next;
            curr.next = after.next;
            after.next = prev.next;
            prev.next = after;
            count++;
        }
        return dummy.next;
    }
}
