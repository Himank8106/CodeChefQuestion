/* Link - https://www.geeksforgeeks.org/problems/split-singly-linked-list-alternatingly/1 */

/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

};
*/

class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
        Node[] ans = {head, head.next};
        while (head.next != null) {
            Node nxt = head.next;
            
            head.next = nxt.next;
            head = nxt;
        }
        return ans;
    }
}
