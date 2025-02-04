/* Link - https://www.geeksforgeeks.org/problems/diameter-of-binary-tree/1 */

/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int ans;
    int diameter(Node root){
        ans = 0;
        func(root);
        return ans;
    }
    int func(Node root){
        if(root==null) return 0;
        int left = func(root.left);
        int right = func(root.right);
        ans = Math.max(ans, left+right);
        return 1+Math.max(left,right);
    }
}
