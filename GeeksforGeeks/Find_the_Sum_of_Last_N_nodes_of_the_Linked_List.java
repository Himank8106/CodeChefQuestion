/* Link - https://www.geeksforgeeks.org/problems/find-the-sum-of-last-n-nodes-of-the-linked-list/1 */

class Solution {
    // Return the sum of last k nodes
       public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        int cnt = 0;
        int ans = 0;
        
        Node curr = head;
        
        while(curr!=null){
            cnt++;
            curr = curr.next;
        }
        
        for(int i=1; i<=cnt; i++){
            if(cnt-i<n){
                ans += head.data;
            }
            
            head = head.next;
        }
        
        return ans;
    }
}
