/* Link - https://www.interviewbit.com/problems/string-and-its-frequency/ */

public class Solution {
    public String solve(String str) {
        HashMap<Character, Integer>map = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            Character curr = str.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0)+1);
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                ans.append(str.charAt(i));
                int val = map.get(str.charAt(i));
                ans.append(Integer.toString(val));
                map.remove(str.charAt(i));
            }
        }
        return ans.toString();
    }
}
