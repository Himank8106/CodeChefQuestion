/* Link - https://www.geeksforgeeks.org/problems/ancestors-in-binary-tree/1 */

/*class Node of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {

    public ArrayList<Integer> Ancestors(Node root, int target) {
        // add your code here
        ArrayList<Integer> al = new ArrayList<>();
        dfs(root, al, target);
        return al;
    }
    private boolean dfs(Node root, ArrayList<Integer> al, int target){
        if(root==null) return false;
        if(root.data==target) return true;
        if(dfs(root.left, al, target) || dfs(root.right, al, target)){
            al.add(root.data);
            return true;
        }
        return false;
    }
}
