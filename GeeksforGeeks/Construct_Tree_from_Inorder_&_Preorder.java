/* Link - https://www.geeksforgeeks.org/problems/construct-tree-1/1 */

/*
class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}
*/

class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            hm.put(inorder[i], i);
        }
        return split(inorder, 0, inorder.length-1, preorder, 0, hm);
    }
    private static Node split(int[] inorder, int instart, int inend, 
        int[] preorder, int index, HashMap<Integer, Integer> hm){
        Node root = new Node(preorder[index]);
        int mid = hm.get(root.data);
        if(mid>instart){
            root.left = split(inorder, instart, mid-1, preorder, index+1, hm);
        } 
        if(mid<inend){
            root.right = split(inorder, mid+1, inend, preorder, index+mid-instart+1, hm);
        }
        return root;
    }
}
