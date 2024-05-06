/* Link - https://leetcode.com/problems/remove-nodes-from-linked-list/ */

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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;
        while(current != null){
            while(!stack.isEmpty() && stack.peek().val < current.val){
                stack.pop();
            }
            stack.push(current);
            current = current.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(ListNode node: stack){
            curr.next = node;
            curr = curr.next;
        }
        curr.next = null;
        return dummy.next;
    }
}
