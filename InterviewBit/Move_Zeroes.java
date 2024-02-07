/* Link - https://www.interviewbit.com/problems/move-zeroes/ */

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            if(A.get(i)>0){
                ans.add(A.get(i));
            }
            else{
                count++;
            }
        }
        for(int i=ans.size(); i<A.size(); i++){
            ans.add(0);
        }
        return ans; 
    }
}
