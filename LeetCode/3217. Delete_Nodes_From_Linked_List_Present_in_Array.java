/* Link - https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/ */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs = new HashSet<>();
        for(int x: nums) hs.add(x);
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode curr = dummy, prev = dummy;
        while(curr!=null){
            if(hs.contains(curr.val)){
                prev.next = curr.next;
            } else prev = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
}
