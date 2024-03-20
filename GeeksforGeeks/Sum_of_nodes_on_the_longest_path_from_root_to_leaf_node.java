/* Link - https://www.geeksforgeeks.org/problems/sum-of-the-longest-bloodline-of-a-tree/1 */

class Solution{
    public int sumOfLongRootToLeafPath(Node root){
        int lenans[] = new int[2];
        solve(0,0,root,lenans);
        return lenans[1];
    }
    static void solve(int sum,int len,Node root,int lenans[]){
        if(root==null) return;
        sum+=root.data;
        len+=1;
        if(len>lenans[0]){
            lenans[0] = len;
            lenans[1] = sum;
        }
        else if(len==lenans[0]){
            lenans[1] = Math.max(lenans[1],sum);
        }
        solve(sum,len,root.left,lenans);
        solve(sum,len,root.right,lenans);
    }
}
