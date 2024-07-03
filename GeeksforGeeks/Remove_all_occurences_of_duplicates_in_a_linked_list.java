/* Link - https://www.geeksforgeeks.org/problems/remove-all-occurences-of-duplicates-in-a-linked-list/1 */

class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        Node ans = new Node(-1);
        Node ref = ans;
        Node curr = head;
        Node temp = head.next;
        while(curr != null){
            if(temp!=null && temp.data==curr.data){
                while(temp!=null && temp.data==curr.data){
                    temp = temp.next;
                }
                if(temp==null) break;
                curr = temp;
                temp = temp.next;
            }
            else{
                ans.next = curr;
                ans = ans.next;
                if(curr.next==null) break;
                curr = curr.next;
                temp = curr.next;
                ans.next = null;
            }
        }
        return ref.next;
    }
}
