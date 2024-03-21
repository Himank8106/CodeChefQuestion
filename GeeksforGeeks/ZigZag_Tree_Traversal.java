/* Link - https://www.geeksforgeeks.org/problems/zigzag-tree-traversal/1 */

class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	Queue<Node>q=new ArrayDeque<>();
    ArrayList<Integer>ans=new ArrayList<>();
    q.add(root);
    boolean flag=true;
    while(!q.isEmpty())
    {
        int n=q.size();
        List<Integer>tempList=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            root=q.remove();
            tempList.add(root.data);
            if(root.left!=null)
            q.add(root.left);
            if(root.right!=null)
            q.add(root.right);
        }
        if(flag==false){
            Collections.reverse(tempList);
            flag=true;
        }
        else
        {
            flag=false;
        }
            ans.addAll(tempList);         
    }
    
    return  ans;
	}
}
