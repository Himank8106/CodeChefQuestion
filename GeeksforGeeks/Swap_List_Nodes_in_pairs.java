/* Link - https://www.interviewbit.com/problems/swap-list-nodes-in-pairs/ */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        if( A == null ) return null;
        if( A.next == null ) return A;
        //create a dummpy ListNode
        ListNode start = new ListNode(0);
        start.next = A; 
        ListNode current = start;
        while( current.next != null && current.next.next != null ){
            current.next = swapPairs( current.next, current.next.next );
            current = current.next.next;
        }
        return start.next;
    }
    public ListNode swapPairs( ListNode p1, ListNode p2){
        p1.next = p2.next;
        p2.next = p1;
        return p2;
    }
}
