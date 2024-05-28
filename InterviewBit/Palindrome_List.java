/* Link - https://www.interviewbit.com/problems/palindrome-list/ */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        if(A==null) return 1;
        ListNode slow=A, fast=A;
        Stack<Integer> st = new Stack<>();
        while(fast!=null && fast.next!=null){
            st.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast!=null) slow = slow.next;
        while(slow!=null){
            if(slow.val != st.pop()) return 0;
            slow = slow.next;
        }
        return 1;
    }
}
