/* Link - https://www.interviewbit.com/problems/colorful-number/ */

public class Solution {
    public int colorful(int A) {
        Set<Integer> s = new HashSet<>();
        String str = String.valueOf(A);
        for (int i = 0; i < str.length(); i++) {
            int prod = 1;
            for (int j = i; j < str.length(); j++) {
                prod *= str.charAt(j) - '0';
                if (!s.add(prod)) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
