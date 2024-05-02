/* Link - https://www.interviewbit.com/problems/first-repeating-element/ */

public class Solution {
    public int solve(int[] A) {
        HashMap<Integer,Integer>map=new HashMap();
        for(int i:A)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(int i=0;i<A.length;i++)
        {
            if(map.get(A[i])>1)
            {
                return A[i];
            }
        }
        return -1;
    }
}
