/* Link - https://www.interviewbit.com/problems/make-equal-elements-array/ */

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        if(A.size()==1) return 1;
        for(int i=1; i<A.size(); i++){
            if(A.get(i)==A.get(i-1)) continue;
            else if(A.get(i)-A.get(i-1)==B) continue; 
            else return 0;
        }
        return 1;
    }
}
