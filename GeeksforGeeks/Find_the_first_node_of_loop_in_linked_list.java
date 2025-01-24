/* Link - https://www.geeksforgeeks.org/problems/find-the-first-node-of-loop-in-linked-list--170645/1 */

/* class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}*/

class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        HashSet<Node> set = new HashSet<>(); 

        Node temp = head; 
        while (temp != null) {
            if (set.contains(temp)) {
                return temp; 
            }
            set.add(temp); 
            temp = temp.next; 
        }

        return null;
    }
}
