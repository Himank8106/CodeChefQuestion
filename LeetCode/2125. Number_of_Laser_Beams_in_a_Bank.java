/* Link - https://leetcode.com/problems/number-of-laser-beams-in-a-bank/ */

class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0, pre = 0;
        for(int i = 0; i < bank.length; i++) {
            int c = 0;
            for(int j = 0; j < bank[i].length(); j++) 
                if(bank[i].charAt(j) == '1') c++;
                if(c == 0) continue;
                ans += pre * c;
                pre = c;
            
        }
        return ans;
    }
}

/* 
int ans=0, prev=0;
        for(int i=0; i<bank.length; i++){
            int current=0;
            char[] ch = bank[i].toCharArray();
            for(char c: ch){
                if(c=='1'){
                    current++;
                }
            }
            if(current>0){
                ans += current*prev;
                prev = current;
            }
        }
        return ans;
*/
