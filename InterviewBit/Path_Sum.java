/* Link - https://www.interviewbit.com/problems/path-sum/ */

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
    public static boolean flag = false;
    public int hasPathSum(TreeNode A, int B) {
        flag = false;
        int sum = 0;
        if (A == null){
            return 0;
        }
        if ( A != null && A.left == null && A.right == null && A.val == B){
            return 1;
        }
        sum += A.val;
        hasPathSumUtil(A,B,sum);
        return flag == true ? 1 : 0;
       
       
    }
      public void hasPathSumUtil(TreeNode A, int B, int sum) {
        if (flag == true){
            return;
        }
        if (A.left == null && A.right == null){
            if (B == sum){
                flag = true;
            }
            return ;
        }
        if (A.left != null){
            hasPathSumUtil(A.left, B,sum + A.left.val);
        }
        if (A.right != null){
             hasPathSumUtil(A.right, B,sum + A.right.val);
        }
       
    }
}
