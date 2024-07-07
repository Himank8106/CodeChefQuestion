/* Link - https://www.interviewbit.com/problems/sum-root-to-leaf-numbers/ */

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
    int sum =0;
    public void helper(TreeNode A){
        if(A==null){
            return;
        }
        if(A.left==null && A.right==null){
            sum =( sum+A.val)%1003;
        }
        if(A.left!=null){
            A.left.val = ((A.val*10)%1003 + A.left.val)%1003;
        }
        if(A.right!=null){
            A.right.val = ((A.val*10)%1003 + A.right.val)%1003;
        }
        helper(A.left);
        helper(A.right);
    }
    public int sumNumbers(TreeNode A) {
        helper(A);
        return sum;
    }
}
