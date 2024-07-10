/* Link - https://www.interviewbit.com/problems/consecutive-parent-child/ */

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
    public int consecutiveNodes(TreeNode A) {
        if(A == null) return 0;
        int count = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(A);
        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode curr = queue.poll();
            int val = curr.val;
            if(curr.left != null){
                queue.add(curr.left);
                int diff = Math.abs(val - curr.left.val);
                if(diff == 1) count++;
            }
            if(curr.right != null){
                queue.add(curr.right);
                int diff = Math.abs(val - curr.right.val);
                if(diff == 1) count++;
            }
        }
        return count;
    }
}
