/* Link - https://www.geeksforgeeks.org/problems/array-to-bst4443/1 */

class Solution {
    public Node sortedArrayToBST(int[] nums) {
        // Code here
        return func(0, nums.length-1, nums);
    }
    public Node func(int l, int r, int[] nums){
        if(l>r) return null;
        int mid = l+(r-l)/2;
        Node root = new Node(nums[mid]);
        root.left = func(l, mid-1, nums);
        root.right = func(mid+1, r, nums);
        return root;
    }
}
