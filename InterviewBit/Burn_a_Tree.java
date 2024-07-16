/* Link - https://www.interviewbit.com/problems/burn-a-tree/ */

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
    private void findHeight(TreeNode root, Map<Integer, List<Integer>> adj, int parent) {
        if (root == null) return;
        
        if (parent != -1) {
            adj.putIfAbsent(parent, new ArrayList<>());
            adj.putIfAbsent(root.val, new ArrayList<>());
            adj.get(parent).add(root.val);
            adj.get(root.val).add(parent);
        }
        
        findHeight(root.left, adj, root.val);
        findHeight(root.right, adj, root.val);
    }
    
    public int solve(TreeNode A, int B) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        findHeight(A, adj, -1);
        
        Map<Integer, Boolean> vis = new HashMap<>();
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {B, 0});
        
        int ans = 0;
        
        while (!q.isEmpty()) {
            int[] current = q.poll();
            int node = current[0];
            int lvl = current[1];
            ans = Math.max(lvl, ans);
            
            vis.put(node, true);
            
            for (int neighbor : adj.get(node)) {
                if (!vis.getOrDefault(neighbor, false)) {
                    q.add(new int[] {neighbor, lvl + 1});
                    vis.put(neighbor, true);
                }
            }
        }
        
        return ans;
    }
}
