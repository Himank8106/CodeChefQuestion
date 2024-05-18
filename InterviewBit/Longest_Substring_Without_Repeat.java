/* Link - https://www.interviewbit.com/problems/longest-substring-without-repeat/ */

public class Solution {
    public int lengthOfLongestSubstring(String A) {
        if(A.length()==0) return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int max=1, j=0;
        for(int i=0; i<A.length(); i++){
            char c = A.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
            while(map.get(c)>1){
                char ch = A.charAt(j);
                map.put(ch, map.get(ch)-1);
                j++;
            }
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}
