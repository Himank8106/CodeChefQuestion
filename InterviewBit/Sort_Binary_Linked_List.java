/* Link - https://www.interviewbit.com/problems/sort-binary-linked-list/ */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        ListNode dummy = new ListNode(0);
        dummy.next = A;
       
        ListNode prev = dummy;
        ListNode current = A;
       
        while (current != null) {
            if(current.next != null && current.next.val < current.val) {
                while (prev.next != null && prev.next.val < current.val) {
                    prev = prev.next;
                }
               
                ListNode temp = prev.next;
                prev.next = current.next;
                current.next = current.next.next;
                prev.next.next = temp;
            }
            else current = current.next;
        }
        return dummy.next;
    }
}
