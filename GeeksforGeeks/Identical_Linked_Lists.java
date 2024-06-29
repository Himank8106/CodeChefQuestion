/* Link - https://www.geeksforgeeks.org/problems/identical-linked-lists/1 */

/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        Node A = head1;
        Node temp = head2;
        
        while (A != null && temp != null) {
            if (A.data != temp.data) {
                return false;
            }
            A = A.next;
            temp = temp.next;
        }
        
        if (A == null && temp == null) {
            return true;
        }
        
        return false;
    }
}
