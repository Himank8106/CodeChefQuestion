/* Link - https://www.interviewbit.com/problems/preorder-traversal/ */

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
    public ArrayList<Integer> pre(TreeNode A){
        ArrayList<Integer> al = new ArrayList<>();
        if(A==null) return al;
        al.add(A.val);
        al.addAll(pre(A.left));
        al.addAll(pre(A.right));
        return al;
    }
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        return pre(A);
    }
}
