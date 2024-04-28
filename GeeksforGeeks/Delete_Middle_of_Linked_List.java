/* Link- https://www.geeksforgeeks.org/problems/delete-middle-of-linked-list/1 */

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
         if(head.next==null){
           return null;
       }
       Node slow=head;
       Node fast=head;
       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       fast=head;                               
       while(fast.next!=slow){             
           fast=fast.next;
       }
       fast.next=fast.next.next;           
       return head;
    }
}
