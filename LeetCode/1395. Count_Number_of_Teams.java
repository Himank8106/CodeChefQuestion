/* Link - https://leetcode.com/problems/count-number-of-teams/ */

class Solution {
    public int numTeams(int[] rating) {
        int total = 0;
        for(int i=0; i<rating.length; i++){
            int leftLarge=0, leftSmall=0, rightLarge=0, rightSmall=0;
            for(int j=i+1; j<rating.length; j++){
                if(rating[j]>rating[i]) rightLarge++;
                else if(rating[j]<rating[i]) rightSmall++;
            }
            for(int j=0; j<i; j++){
                if(rating[j]>rating[i]) leftLarge++;
                else if(rating[j]<rating[i]) leftSmall++;
            }
            total += leftLarge*rightSmall + rightLarge*leftSmall;
        }
        return total;
    }
}
