/* Link - https://www.geeksforgeeks.org/problems/print-all-nodes-that-dont-have-sibling/1 */

class Tree
{
     ArrayList<Integer> noSibling(Node node)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        inorder(al,node);
        Collections.sort(al);   
        if(al.size()==0)
        {
            al.add(-1);
            return al;
        }
        return al;
    }
    
    static void inorder(ArrayList<Integer> al , Node root)
    {
        if(root==null)
            return;
            
        inorder(al,root.left);
        
        if(root.left!=null && root.right==null)
        {
            al.add(root.left.data);
        }
        else if(root.left==null && root.right!=null)
        {
            al.add(root.right.data);
        }
        
        inorder(al,root.right);
    }
}
