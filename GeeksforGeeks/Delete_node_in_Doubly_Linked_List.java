/* Link - https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1 */

/*

Definition for doubly Link List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node h, int x) {
        if(x == 1){
            return h.next;
        }
        Node head = h;
        while(x-->1 && head!=null){
            head = head.next;
        }
        if(head.next==null){
            head.prev.next = null;
        }
        else{
            head.prev.next = head.next;
            head.next.prev = head.prev;
        }
        return h;
    }
}
