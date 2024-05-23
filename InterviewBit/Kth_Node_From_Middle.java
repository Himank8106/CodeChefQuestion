/* Link - https://www.interviewbit.com/problems/kth-node-from-middle/ */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A, int B) {
        ListNode curr = A;
        int n = 0;
       
        while(curr != null){
            n++;
            curr = curr.next;
        }
       
        int m = (n/2) + 1;
       
        int pos = m - B;
       
        if(pos <= 0) return -1;
        else{
            curr = A;
            int count = 1, ans = 0;
            while(curr != null){
                if(count == pos) {
                    ans = curr.val;
                    break;
                }
               
                count++;
                curr = curr.next;
            }
            return ans;
        }
    }
}
