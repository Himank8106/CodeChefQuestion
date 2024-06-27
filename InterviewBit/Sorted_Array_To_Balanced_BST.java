/* Link - https://www.interviewbit.com/problems/sorted-array-to-balanced-bst/ */

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
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public TreeNode sortedArrayToBST(final int[] A) {
        return sortedArrayToBST(A, 0, A.length-1);
    }
    
    public TreeNode sortedArrayToBST(int[] arr, int start, int end) {
        if(start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = sortedArrayToBST(arr, start, mid-1);
        root.right = sortedArrayToBST(arr, mid+1, end);
        return root;
    }
}
