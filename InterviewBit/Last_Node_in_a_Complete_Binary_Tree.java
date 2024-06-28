/* Link - https://www.interviewbit.com/problems/last-node-in-a-complete-binary-tree/ */

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
    public int lastNode(TreeNode A) {
        level_order_traversal(A);
        return list.get(list.size()-1);
    }
    ArrayList<Integer> list = new ArrayList<>();
    public void level_order_traversal(TreeNode root){
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        list.add(root.val);
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            list.add(curr.val);
            if(curr.left != null) queue.add(curr.left);
            if(curr.right != null) queue.add(curr.right);
        }
    }
}
