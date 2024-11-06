/* Link - https://www.geeksforgeeks.org/problems/root-to-leaf-paths-sum/1 */

/*
class Tree
{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=null;
          right=null;
}
}*/
class Solution {
    public static int res = 0;
    public static void dfs(Node root, int ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            res += (ans*10+root.data);
            return;
        }
        dfs(root.left, ans*10+root.data);
        dfs(root.right, ans*10+root.data);
    }
    public static int treePathsSum(Node root) {
        // add code here.
        res = 0;
        dfs(root, 0);
        return res;
    }
}
