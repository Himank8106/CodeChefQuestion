/* Link - https://www.interviewbit.com/problems/first-non-repeating-character-in-a-stream-of-characters/ */

public class Solution {
    public String solve(String A) {
        StringBuilder ans = new StringBuilder();
        Queue<Character> q = new LinkedList<>();
        int[] count = new int[26];
       
        // Iterate through the string
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch); // Normalize to lowercase for case insensitivity
                count[ch - 'a']++;
                q.add(ch);
               
                // Remove characters from the front of the queue that have appeared more than once
                while (!q.isEmpty() && count[q.peek() - 'a'] > 1) {
                    q.poll();
                }
               
                if (!q.isEmpty()) {
                    ans.append(q.peek());
                } else {
                    ans.append("#");
                }
            } else {
                ans.append("#"); // For non-letter characters
            }
        }
        return ans.toString();
    }
}
