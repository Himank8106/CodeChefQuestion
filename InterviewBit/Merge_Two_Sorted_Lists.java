/* Link - https://www.interviewbit.com/problems/merge-two-sorted-lists/ */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
          ListNode tail = null, head = null;
       
        if(A.val < B.val){
           head = A;
           A = A.next;
        }else{
          head = B;
          B = B.next;
        }
         
          tail = head;
         
         while(A!=null && B!=null){
             if(A.val < B.val){
                 tail.next = A;
                 tail = A;
                 A = A.next;
             }else{
                 tail.next = B;
                 tail = B;
                 B = B.next;
             }
         }
         if(A==null) tail.next = B;
         else tail.next = A;
         return head;
    }
}
