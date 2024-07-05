/* Link - https://www.interviewbit.com/problems/zigzag-level-order-traversal-bt/ */

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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        boolean b = true;
        if(A==null) return al;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        while(!q.isEmpty()){
            ArrayList<Integer> a = new ArrayList<>();
            int size = q.size();
            while(size-->0){
                TreeNode curr = q.poll();
                a.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            if(b){
                al.add(a);
                b = !b;
            }
            else{
                Collections.reverse(a);
                al.add(a);
                b = !b;
            }
        }
        return al;
    }
}
