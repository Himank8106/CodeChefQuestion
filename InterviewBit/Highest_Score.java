/* Link - https://www.interviewbit.com/problems/highest-score/ */

public class Solution {
    public int highestScore(String[][] A) {
        Map<String,Integer> m=new HashMap<>();
         Map<String,Integer> hm=new HashMap<>();
         int max=Integer.MIN_VALUE;
       
        for(int i=0;i<A.length;i++){
            m.put(A[i][0],m.getOrDefault(A[i][0],0)+Integer.valueOf(A[i][1]));
        }
       
       
        for(int i=0;i<A.length;i++){
            hm.put(A[i][0],hm.getOrDefault(A[i][0],0)+1);
        }
       
        for(Map.Entry<String,Integer> i:m.entrySet()){
        int val=i.getValue()/hm.get(i.getKey());
        if(max<val){
            max=val;
        }
       }
       return max;
    }
}
