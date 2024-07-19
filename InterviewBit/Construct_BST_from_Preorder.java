/* Link - https://www.interviewbit.com/problems/construct-bst-from-preorder/ */

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
    public TreeNode constructBST(ArrayList<Integer> A) {
        return constructBST(A, Integer.MAX_VALUE);
    }
    
    int i = 0;
    
    public TreeNode constructBST(ArrayList<Integer> list, int upper_bound){
        if(i == list.size() || list.get(i) > upper_bound) return null;
        TreeNode root = new TreeNode(list.get(i++));
        root.left = constructBST(list, root.val);
        root.right = constructBST(list, upper_bound);
        return root;
    }
}
