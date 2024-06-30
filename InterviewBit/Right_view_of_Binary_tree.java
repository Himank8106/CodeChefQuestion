/* Link - https://www.interviewbit.com/problems/right-view-of-binary-tree/ */

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
public class Solution
{
    ArrayList<Integer> arr=new ArrayList<Integer>();
    public ArrayList<Integer> solve(TreeNode A)
    {
        traverse(A,0);
        return arr;
    }
    public void traverse(TreeNode node,int depth)
    {
        if(node!=null)
        {
            if(depth==arr.size())
                arr.add(node.val);
            traverse(node.right,depth+1);
            traverse(node.left,depth+1);
        }
    }
}
