/* Link - https://www.interviewbit.com/problems/vertical-sum-of-a-binary-tree/ */

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
    public ArrayList<Integer> verticalSum(TreeNode A) {
    TreeMap<Integer, Integer> ts = new TreeMap<>();
        solve(A, ts, 0);
        ArrayList<Integer> al = new ArrayList<>();
        for(Integer data: ts.keySet()) al.add(ts.get(data));
        return al;
    }
    public void solve(TreeNode A, TreeMap<Integer, Integer> t, int level){
        if(A==null) return;
        t.put(level, t.getOrDefault(level, 0)+A.val);
        solve(A.left, t, level-1);
        solve(A.right, t, level+1);
    }
}
