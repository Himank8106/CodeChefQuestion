/* Link - https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1 */ 

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();
        HashMap<Node, Integer> hm = new HashMap<>();
        Queue<Node> q = new LinkedList();
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        q.add(root);
        hm.put(root,0);
        while(q.size()>0){
            Node node = q.poll();
            int x = hm.get(node);
            if(!tm.containsKey(x)) tm.put(x, new ArrayList<>());
            tm.get(x).add(node.data);
            if(node.left!=null){
                q.add(node.left);
                hm.put(node.left, x-1);
            }
            if(node.right!=null){
                q.add(node.right);
                hm.put(node.right, x+1);
            }
        }
        for(int n: tm.keySet()){
            ArrayList<Integer> a = tm.get(n);
            ans.add(a.get(a.size()-1));
        }
        return ans;
    }
}
