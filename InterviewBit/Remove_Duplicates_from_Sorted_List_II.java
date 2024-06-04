/* Link - https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list-ii/ */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        if(A==null || A.next==null) return A;
        ListNode helper = new ListNode(-1);
        ListNode prev = helper, curr = A, nextNode;
        while(curr != null){
            nextNode = curr.next;
            boolean duplicate = false;
            while(nextNode!=null && nextNode.val==curr.val){
                nextNode = nextNode.next;
                duplicate = true;
            }
            if(!duplicate){
                prev.next = curr;
                prev = prev.next;
                curr = curr.next;
            }
            if(duplicate) curr = nextNode;
        }
        prev.next = null;
        return helper.next;
    }
}
