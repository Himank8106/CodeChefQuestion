/* Link - https://www.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1 */

class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->a.data-b.data);
        for(Node n:arr)
        {
        if (n != null)
        pq.add(n);
        }
        Node head=null,tail=null;
        while(!pq.isEmpty())
        {
            Node temp=pq.poll();
            if(head==null)
            {
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            if(temp.next!=null)
            {
                pq.add(temp.next);
            }
        }
        return head;
    }
}
