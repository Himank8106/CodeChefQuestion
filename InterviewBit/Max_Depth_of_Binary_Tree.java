/* Link - https://www.interviewbit.com/problems/max-depth-of-binary-tree/ */

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
    public int maxDepth(TreeNode A) {
        if(A==null) return 0;
        else{
            int r = 1 + maxDepth(A.left);
            int l = 1 + maxDepth(A.right);
            return Math.max(l,r);
        }
    }
}
