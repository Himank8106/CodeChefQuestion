/* Link - https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1 */

/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution
{   
    Node LCA(Node root, Node n1, Node n2) {
        // your code here.
        if(n1.data == root.data || n2.data == root.data)
        {
            return root;
        }
        
        else if(n1.data < root.data && n2.data < root.data)
        {
            return(LCA(root.left,n1,n2));
        }
        
         else if(n1.data > root.data && n2.data > root.data)
        {
            return(LCA(root.right,n1,n2));
        }
        
        else
        {
            return root;
        }
    }
}
