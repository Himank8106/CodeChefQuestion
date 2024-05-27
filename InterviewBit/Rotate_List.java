/* Link - https://www.interviewbit.com/problems/rotate-list/ */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
      public ListNode rotateRight(ListNode A, int B) {
        if (A == null || A.next == null || B == 0) {
            return A;
        }
        ListNode curr = A;
        int count = 1;
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }
        curr.next = A;
        B = B % count;
        B = count - B;
        while (B-- > 0) {
            curr = curr.next;
        }
        A = curr.next;
        curr.next = null;
        return A;
    }
}
