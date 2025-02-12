/* Link - https://www.geeksforgeeks.org/problems/find-k-th-smallest-element-in-bst/1 */


// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        ArrayList<Integer> al = new ArrayList<>();
        func(root,al);
        if(k<=al.size()){
            for(int i=0; i<al.size(); i++){
                if(i==k-1) return al.get(i);
            }
        } 
        return -1;
    }
    private void func(Node root, ArrayList<Integer> al){
        if(root==null) return;
        func(root.left,al);
        al.add(root.data);
        func(root.right,al);
    }
}




