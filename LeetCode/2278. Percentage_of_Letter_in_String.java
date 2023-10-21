/* Link - https://leetcode.com/problems/percentage-of-letter-in-string/ */

class Solution {
    public int percentageLetter(String s, char letter) {
       // float ans =(countCharacter(s,letter)*100);
        return (int) ((countCharacter(s,letter)*100)/s.length());
        
    }

    float countCharacter(String s , char ch ){
        float count =0;
        for(int i=0;i<s.length();i++){
            if(ch==s.charAt(i)){
                count++;
            }
        }
    return count ;
    }
    }


/* 
int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==letter) count++;
        }
        return (100*count)/n;
*/
