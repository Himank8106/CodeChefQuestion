/* Link - https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1 */

class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node l = head, start = head;
        while(l.next!=null) l = l.next;
        while(k-->0){
            l.next = start;
            start = start.next;
            l = l.next;
        }
        l.next = null;
        return start;
    }
}
