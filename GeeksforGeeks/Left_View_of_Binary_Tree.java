/* Link - https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1 */

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> al = new ArrayList<>();
      if(root==null) return al;
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while(q.size()>0){
          int size = q.size();
          for(int i=0; i<size; i++){
              Node node = q.poll();
              if(i==0) al.add(node.data);
              if(node.left!=null) q.add(node.left);
              if(node.right!=null) q.add(node.right);
          }
      }
      return al;
    }
}
