/* Link - https://www.interviewbit.com/problems/all-factors/ */

public class Solution {
    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i*i<=A; i++){
            if(A%i == 0){
                if(i == A/i) ans.add(i);
                if(i != A/i){
                    ans.add(i);
                    ans.add(A/i);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
