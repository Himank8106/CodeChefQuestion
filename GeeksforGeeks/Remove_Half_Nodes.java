/* Link - https://www.interviewbit.com/problems/valid-bst-from-preorder/ */

// User function Template for Java

/*

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

*/

class Solution {
    // Return the root of the modified tree after removing all the half nodes.
    public Node RemoveHalfNodes(Node root) {
        // Code Here
        if(root == null){
            return null;
        }
        root.left = RemoveHalfNodes(root.left);
        root.right = RemoveHalfNodes(root.right);
        if(root.left == null && root.right!=null){
            return root.right;
        }
        else if(root.left !=null && root.right == null){
            return root.left;
        }
        return root;
    }
}

