/* Link - https://www.interviewbit.com/problems/addition-without-summation/ */

public class Solution {
    public int addNumbers(int A, int B) {
        return A-(~B)-1;
    }
}
