/* Link - https://www.interviewbit.com/problems/reverse-level-order/ */

public class Solution {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> al = new ArrayList<>();
        if(A==null) return al;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        while(!q.isEmpty()){
            TreeNode x = q.remove();
            al.add(x.val);
            if(x.right!=null) q.add(x.right);
            if(x.left!=null) q.add(x.left);
        }        
        Collections.reverse(al);
        return al;
    }
}
