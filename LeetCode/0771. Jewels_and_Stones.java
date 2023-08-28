/* Link - https://leetcode.com/problems/jewels-and-stones/ */

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res=0;
        for(int i=0; i<jewels.length(); i++) {
            char ch1=jewels.charAt(i);
            for(int j=0; j<stones.length(); j++) {
                char ch2=stones.charAt(j);
                if(ch1==ch2)     
                    res++;
            }
        }
        return res;
    }
}


/*
int count = 0;
for(int i=0; i<stones.length(); i++){
    for(int j=0; j<jewels.length(); j++){
        if(jewels.charAt(j)==stones.charAt(i)){
            count++;
        }
    }
}
return count;
*/
