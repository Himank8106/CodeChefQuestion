/* Link - https://www.geeksforgeeks.org/problems/sum-of-leaf-nodes-in-bst/1 */

class Solution
{
    public static int sumOfLeafNodes(Node root)
    {
        // code here 
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return root.data;
        }
        return sumOfLeafNodes(root.left)+sumOfLeafNodes(root.right);
    }
}
