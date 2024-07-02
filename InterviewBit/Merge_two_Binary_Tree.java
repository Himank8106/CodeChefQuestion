/* Link - https://www.interviewbit.com/problems/merge-two-binary-tree/ */

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
    public TreeNode solve(TreeNode A, TreeNode B) {
        if(A==null && B==null){
            return null;
        }else if(A!=null && B==null){
            return A;
        }else if(A==null && B!=null){
            return B;
        }else{
            TreeNode newNode = new TreeNode(A.val+B.val);
            newNode.left = solve(A.left,B.left);
            newNode.right = solve(A.right,B.right);
            return newNode;
        }
    }
}
