/* Link - https://leetcode.com/problems/merge-nodes-in-between-zeros/ */

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
    public ListNode mergeNodes(ListNode head) {
        ListNode l = new ListNode(-1);
        ListNode x = l;
        int sum = 0;
        head = head.next;
        while(head!=null){
            if(head.val==0){
                ListNode temp = new ListNode(sum);
                l.next = temp;
                l = l.next;
                head = head.next;
                sum = 0;
            }
            else{
                sum += head.val;
                head = head.next;
            }
        }
        return x.next;
    }
}
