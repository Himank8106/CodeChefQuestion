/* Link - https://www.interviewbit.com/problems/longest-subarray-length/ */

public class Solution {
    public int solve(int[] A) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
       
        for(int i=0;i<A.length;i++){
            if(A[i]==0) A[i] = -1;
        }
       
        int sum = 0;
        int maxLen = 0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            if(!map.containsKey(sum))
            map.put(sum,i);
            if(map.containsKey(sum-1)){
                maxLen = Math.max(maxLen, i-map.get(sum-1));
            }
        }
        return maxLen;
    }
}
