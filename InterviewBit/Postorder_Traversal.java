/* Link - https://www.interviewbit.com/problems/postorder-traversal/ */

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
    public ArrayList<Integer> post(TreeNode A){
        ArrayList<Integer> al = new ArrayList<>();
        if(A==null) return al;
        al.addAll(post(A.left));
        al.addAll(post(A.right));
        al.add(A.val);
        return al;
    }
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        return post(A);
    }
}
