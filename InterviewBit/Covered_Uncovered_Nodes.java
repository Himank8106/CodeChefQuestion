/* Link - https://www.interviewbit.com/problems/covered-uncovered-nodes/ */

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public Long coveredNodes(TreeNode A) {
        long covered = 0, uncovered = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        while(!q.isEmpty()){
            int x = q.size();
            for(int i=0; i<x; i++){
                if(i==0 || i==x-1) uncovered += q.peek().val;
                else covered += q.peek().val;
                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);
                q.remove();
            }
        }
        return Math.abs(covered-uncovered);
    }
}
