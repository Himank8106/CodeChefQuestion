/* Link - https://www.geeksforgeeks.org/problems/k-sum-paths/1 */

/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int count = 0;
    public int sumK(Node root, int k) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        dfs(root,k,al);
        return count;
    }
    private void dfs(Node root, int k, ArrayList<Integer> al){
        if(root==null) return;
        al.add(root.data);
        int sum = 0;
        for(int i=al.size()-1; i>=0; i--){
            sum += al.get(i);
            if(sum==k) count++;
        }
        dfs(root.left,k,al);
        dfs(root.right,k,al);
        al.remove(al.size()-1);
    }
}
