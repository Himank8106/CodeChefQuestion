/* Link - https://www.interviewbit.com/problems/diagonal-traversal/ */ 

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
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer>list = new ArrayList<>();
        Deque<TreeNode>dq = new ArrayDeque<>();
        dq.add(A);
        while(!dq.isEmpty()) {
            int size = dq.size();
            for(int i=0; i<size; i++) {
                TreeNode node = dq.poll();
                list.add(node.val);
                if(node.right != null) {
                    dq.addFirst(node.right);
                }
                if(node.left != null) {
                    dq.addLast(node.left);
                }
            }
        }
        
        return list;
    }
}
