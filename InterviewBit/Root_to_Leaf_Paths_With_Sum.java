/* Link - https://www.interviewbit.com/problems/root-to-leaf-paths-with-sum/ */

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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        if(A == null) return ans;
        pathSum(A, B, new ArrayList<Integer>());
        return ans;
    }
    
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    
    public void pathSum(TreeNode root, int target, ArrayList<Integer> list){
        if(root == null) return;
        
        list.add(root.val);
        target -= root.val;
        
        if(is_leaf_node(root) && target == 0) 
            ans.add(new ArrayList<>(list));
        
        pathSum(root.left, target, list);
        pathSum(root.right, target, list);
        list.remove(list.size()-1);
    }
    
    public boolean is_leaf_node(TreeNode root){
        if(root.left == null && root.right == null) return true;
        return false;
    }
}
