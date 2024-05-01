/* Link - https://www.interviewbit.com/problems/check-palindrome/ */

public class Solution {
    public int solve(String A) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<A.length(); i++){
            map.put(A.charAt(i), map.getOrDefault(A.charAt(i),0)+1);
        }
        int count = 0;
        for(char i='a'; i<='z'; i++){
            if(map.containsKey(i)){
                if((map.get(i))%2==1){
                    count++;
                    if(count>1) return 0;
                }
            }
        }
        return 1;
    }
}
