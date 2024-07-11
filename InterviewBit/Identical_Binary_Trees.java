/* Link - https://www.interviewbit.com/problems/identical-binary-trees/ */

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
    public int isSameTree(TreeNode A, TreeNode B) {
        flag = 1;
        if ((A == null && B != null) || (A != null && B == null)){
            return 0;
        }
        isSameTreeUtil(A,B);
        return flag;
    }
     public void isSameTreeUtil(TreeNode A, TreeNode B) {
          if (A == null && B == null){
            return;
        }
          if ((A == null && B != null) || (A != null && B == null)){
              flag = 0;
            return;
        }
         if (A.val != B.val){
            flag = 0;
            return;
        }
        isSameTreeUtil(A.left,B.left);
        isSameTreeUtil(A.right,B.right);
       
    }
}
