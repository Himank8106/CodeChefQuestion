/* Link - https://www.geeksforgeeks.org/problems/insert-in-sorted-way-in-a-sorted-dll/1 */

/*class of the node of the DLL is as
/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        Node newNode = new Node(x);

        // Case 1: Insert at the beginning if list is empty or x is smaller than head's data
        if (head == null || head.data >= x) {
            newNode.next = head;
            if (head != null) head.prev = newNode;
            return newNode;
        }

        // Case 2: Traverse to find the correct position for the new node
        Node current = head;
        while (current.next != null && current.next.data < x) {
            current = current.next;
        }

        // Insert the new node after current
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;

        // Return the head of the list
        return head;
    }
}
