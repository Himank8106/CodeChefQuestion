/* Link - https://www.interviewbit.com/problems/path-to-given-node/ */

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
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        preorder(A, B, ans);
        Collections.reverse(ans);
        return ans;
    }
    
    public boolean preorder(TreeNode root, int target, ArrayList<Integer> list){
        if(root == null) return false;
        if(root.val == target){
            list.add(root.val); return true;
        }
        if(preorder(root.left, target, list)){
            list.add(root.val); return true;
        }
        if(preorder(root.right, target, list)){
            list.add(root.val); return true;
        }
        return false;
    }
}
