/* Link - https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1 */

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        //Code here
        Node curr = head;
        int pos = 0;
        if (head == null) return 0;
        while(curr!= null){
            pos++;
            curr = curr.next;
        }
        return pos;
    }
}
