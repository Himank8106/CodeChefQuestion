/* Link - https://leetcode.com/problems/palindrome-number/ */

class Solution {
    public boolean isPalindrome(int num) {
        if(num < 0)
            return false;
        int rev = 0;
        int temp = num;
        while(num != 0)
        {
            int rem = num % 10;
            num = num / 10;
            rev = (rev*10) + rem;
        }
        if(temp == rev)
            return true;
        
        return false;
    }
}

/* 
        String s = String.valueOf(x);
        int n = s.length();
        for(int i=0; i<n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
*/
