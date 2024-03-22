/* Link - https://www.geeksforgeeks.org/problems/diagonal-sum-in-binary-tree/1 */

class Tree {
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        // code here.
        ArrayList <Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            while(size > 0){
                Node node = q.poll();
                while(node != null){
                    if(node.left != null){
                        q.add(node.left);
                    }
                    sum+= node.data;
                    node = node.right;
                }
                size--;
            }
            ans.add(sum);
        }
        return ans;
    }
}
