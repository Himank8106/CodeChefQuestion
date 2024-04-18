/* Link - https://www.interviewbit.com/problems/palindrome-string/ */

public class Solution {
    public int isPalindrome(String A) {
        A = A.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
        for(int i = 0; i < A.length() -1 / 2; i++){
            if(A.charAt(i) != A.charAt(A.length() -1 - i))
                return 0;
        }
        return 1;
    }
}
