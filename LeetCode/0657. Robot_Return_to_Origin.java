/* Link - https://leetcode.com/problems/robot-return-to-origin/ */

class Solution {
    public boolean judgeCircle(String moves) {
        int[] count = new int[26];
        for(char c: moves.toCharArray()){
            count[c-'A']++;
        }
        return count['D'-'A']==count['U'-'A'] && count['L'-'A']==count['R'-'A'];
    }
}

/* 
int a=0,c=0;
        for(int i=0;i<moves.length();i++)
        {
            switch(moves.charAt(i)){
                case 'L':a++; break;
                case 'R':a--; break;
                case 'U':c++; break;
                default:c--; break;
            }
        }
        if(a==0&&c==0)
        return true;
        else 
        return false;
*/
