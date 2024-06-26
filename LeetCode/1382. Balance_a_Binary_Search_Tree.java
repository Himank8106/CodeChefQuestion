/* Link - https://leetcode.com/problems/balance-a-binary-search-tree/ */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<TreeNode> sortedArr = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorderTraversal(root);
        return sortedArrayToBST(0, sortedArr.size()-1);
    }
    private void inorderTraversal(TreeNode root){
        if(root==null) return;
        inorderTraversal(root.left);
        sortedArr.add(root);
        inorderTraversal(root.right);
    }
    private TreeNode sortedArrayToBST(int start, int end){
        if(start>end) return null;
        int mid = (start+end)/2;
        TreeNode root = sortedArr.get(mid);
        root.left = sortedArrayToBST(start, mid-1);
        root.right = sortedArrayToBST(mid+1, end);
        return root;
    }
}
