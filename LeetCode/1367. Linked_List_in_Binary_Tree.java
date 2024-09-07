/* Link - https://leetcode.com/problems/linked-list-in-binary-tree/ */

class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        return dfs(head, head, root);
    }
    public boolean dfs(ListNode head, ListNode curr, TreeNode root){
        if(curr==null) return true;
        if(root==null) return false;
        if(curr.val==root.val) curr = curr.next;
        else if(head.val==root.val) head = head.next;
        else curr = head;
        return dfs(head, curr, root.left) || dfs(head, curr, root.right);
    }
}
