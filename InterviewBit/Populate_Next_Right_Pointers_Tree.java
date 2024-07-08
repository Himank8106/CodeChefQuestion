/* Link - https://www.interviewbit.com/problems/populate-next-right-pointers-tree/ */

/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        Queue<TreeLinkNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                TreeLinkNode curr = q.poll();
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                TreeLinkNode temp = null;
                if(size != 0) temp = q.peek();
                curr.next = temp;
            }
        }
        
    }
}
