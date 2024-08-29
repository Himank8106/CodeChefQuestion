/* Link - https://www.geeksforgeeks.org/problems/find-length-of-loop/1 */

class Solution {
    public int loop(Node head){
        Node slow = head, fast = head;
        int count=0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
               Node temp = slow;
                 do{
                    count++;
                    temp = temp.next;
                } while(temp!=slow);
                return count;
            } 
        }
        return 0;
    }
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        return loop(head);
    }
}
