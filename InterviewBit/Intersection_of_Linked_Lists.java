/* Link - https://www.interviewbit.com/problems/intersection-of-linked-lists/ */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
        ListNode d1 = a;
        ListNode d2 = b;
        if (a == null || b == null){
        return null;
        }
        while(d1 != d2){
        if (d1 == null){
        d1 = b;
        }
        else{
        d1 = d1.next;
        }
        if (d2 == null){
        d2 = a;
        }
        else{
        d2 = d2.next;
        }
        }
        return d1;
	}
}
