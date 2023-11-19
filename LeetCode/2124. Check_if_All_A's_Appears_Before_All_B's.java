/* Link - https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/ */

class Solution {
    public boolean checkString(String s) {
        char ch[]=s.toCharArray();
      for(int i=0;i<ch.length-1;i++){
       if(ch[i]=='b'&&ch[i+1]=='a')
       return false;
      } 
      return true;
    }
}


/* 
for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='b'&&s.charAt(i+1)=='a')
            return false;
        }
        return true;
*/
