/* Link - https://www.geeksforgeeks.org/problems/root-to-leaf-path-sum/1 */


/*
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    /*you are required to complete this function */
        /*you are required to complete this function */
    boolean hasPathSum(Node root, int target) {
        // Your code here
        
        return recur(root,target,0);
    }
    boolean recur(Node root,int target,int sum){
        if(root==null){
            return false;
        }
        sum+=root.data;
        if(root.left==null&&root.right==null){
            return sum==target;
        }
        return recur(root.left,target,sum)||
               recur(root.right,target,sum);
        
    }
}
