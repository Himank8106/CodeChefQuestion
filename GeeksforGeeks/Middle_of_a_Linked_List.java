/* Link - https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1 */

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        // Your code here.
        int count = 0;
        Node st = head;
        while(st!=null){
            st = st.next;
            count++;
        }
        count /= 2;
        while(count-->0){
            head = head.next;
        }
        return head.data;
    }
}

