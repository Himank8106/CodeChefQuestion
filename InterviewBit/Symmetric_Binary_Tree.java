/* Link - https://www.interviewbit.com/problems/symmetric-binary-tree/ */

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
    public static int flag = 1;
    public int isSymmetric(TreeNode A) {
        flag = 1;
        if(A==null) return 1;
        isSym(A.left, A.right);
        return flag;
    }
    public void isSym(TreeNode A, TreeNode B){
        if(A==null && B==null) return;
        if((A!=null && B==null) || (A==null && B!=null)){
            flag = 0;
            return;
        }
        if(A.val != B.val){
            flag = 0;
            return;
        }
        isSym(A.left, B.right);
        isSym(A.right, B.left);
    }
}
