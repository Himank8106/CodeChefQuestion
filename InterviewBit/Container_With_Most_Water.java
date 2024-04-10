/* Link - https://www.interviewbit.com/problems/container-with-most-water/ */

public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        int n = A.size();
        int i=0,j=n-1;
        int ans=0;
        while(i<j){
            int h = Math.min(A.get(i),A.get(j));
            int b = (j-i);
            int area = (h*b);
            ans=Math.max(ans,area);
            if(A.get(i)<=A.get(j)) i++;
            else j--;
        }
        return ans;
    }
}
