/* Link - https://www.geeksforgeeks.org/problems/check-for-bst/1 */

class Solution {
    // Function to check whether a Binary Tree is BST or not.

    boolean solve(Node root ,int mini , int maxi){
        if(root==null){
            return true;
        }

        if(root.data >= maxi || root.data<=mini)
        {
            return false;
        }
        return solve(root.left, mini, root.data) && solve(root.right, root.data, maxi);
    }
    boolean isBST(Node root) {
        // code here.
        return solve(root , Integer.MIN_VALUE , Integer.MAX_VALUE);
    }
}
