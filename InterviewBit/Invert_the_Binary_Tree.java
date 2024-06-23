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
    public void fun(TreeNode A){
        if(A==null) return;
        fun(A.left);
        fun(A.right);
        TreeNode temp = A.left;
        A.left = A.right;
        A.right = temp;
    }
    public TreeNode invertTree(TreeNode A) {
        fun(A);
        return A;
    }
}

