/* Link - https://www.interviewbit.com/problems/largest-continuous-sequence-zero-sum/ */

public class Solution {
    public int[] lszero(int[] A) {
        Map<Integer,Integer> map = new HashMap<>();
        int start = -1;
        int end = -1;
        map.put(0,-1);
       
        int sum = 0;
        int maxLen = 0;
        for(int i = 0;i<A.length;i++){
            sum+=A[i];
           
            if(map.containsKey(sum)){
               
                if(i-map.get(sum) > maxLen ){
                   
                    start = map.get(sum);
                    end = i;
                }
                maxLen = Math.max(maxLen,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
       
       
        int[] ans = new int[end-start];
        int j = 0;
        for(int i=start+1;i<=end;i++)
         ans[j++] = A[i];
         
         return ans;
    }
}
