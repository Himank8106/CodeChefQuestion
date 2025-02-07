/* Link - https://www.geeksforgeeks.org/problems/inorder-traversal/1 */

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> al = new ArrayList<>();
        inOrderTraversal(root, al);
        return al;
    }
    
    void inOrderTraversal(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        inOrderTraversal(root.left, arr);
        arr.add(root.data);
        inOrderTraversal(root.right, arr);
    }
}
