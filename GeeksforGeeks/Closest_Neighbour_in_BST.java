/* Link - https://www.geeksforgeeks.org/problems/closest-neighbor-in-bst/1 */

class Solution {
    public static int findMaxForN(Node root, int n) {
        // Add your code here.
        int ans = -1;
        while(root!=null)
        {
            if(root.key > n ) 
             root = root.left;
            else if(root.key <= n )
            {
                ans = root.key;
                 root= root.right;
            }
        }
        return ans;
    }
}
