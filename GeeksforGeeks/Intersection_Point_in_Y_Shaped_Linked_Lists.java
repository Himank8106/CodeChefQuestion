/* Link - https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1 */

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2) {
        int len1 = getLength(head1);
        int len2 = getLength(head2);

        // Advance the pointer for the longer list
        if (len1 > len2) {
            head1 = advanceListByK(head1, len1 - len2);
        } else {
            head2 = advanceListByK(head2, len2 - len1);
        }

        // Traverse both lists in sync to find intersection
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1.data;  // Intersection found
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        
        return -1;  // No intersection
    }

    // Helper function to get length of a linked list
    int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    // Helper function to advance a list by k nodes
    Node advanceListByK(Node head, int k) {
        while (k-- > 0 && head != null) {
            head = head.next;
        }
        return head;
    }
}
