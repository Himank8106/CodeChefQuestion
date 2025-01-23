/* Link - https://www.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1 */

/*linked list node
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/
class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        Map<Node,Node> map=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            map.put(temp,new Node(temp.data));
            temp=temp.next;
        }
        map.put(null,null);
        temp=head;
        while(temp!=null){
            map.get(temp).next=map.get(temp.next);
            map.get(temp).random=map.get(temp.random);
            temp=temp.next;
        }
        return map.get(head);
    }
}
