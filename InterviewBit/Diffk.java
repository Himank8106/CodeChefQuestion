/* Link - https://www.interviewbit.com/problems/diffk/ */

public class Solution {
    public int diffPossible(ArrayList<Integer> A, int B) {
        int start = 0;
        int end = 1;
        while (start<A.size() && end < A.size()) {
            int diff = A.get(end) - A.get(start);
            if (diff < B) {
                end++;
            } else if (diff > B) {
                start++;
            } else if (start != end) {
                return 1;
            } else {
                end++;
            }
        }
        return 0;
    }
}
