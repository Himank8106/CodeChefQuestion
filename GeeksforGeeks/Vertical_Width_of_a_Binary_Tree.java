/* Link - https://www.geeksforgeeks.org/problems/vertical-width-of-a-binary-tree/1 */

class Solution {
    // Function to find the vertical width of a Binary Tree.
    public int verticalWidth(Node root) {
       if (root == null) return 0;
       HashSet<Integer> hs = new HashSet<>();
       solve(root, 0, hs);
       return hs.size();
    }
    private void solve(Node root, int level, HashSet<Integer> hs){
        if(root==null) return;
        hs.add(level);
        solve(root.left, level-1, hs);
        solve(root.right, level+1, hs);
    }
}
