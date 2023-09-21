/* Link - https://leetcode.com/problems/number-of-senior-citizens/ */

class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0; i < details.length; i++)
            if(details[i].charAt(details[i].length() - 4) == '6'
            && details[i].charAt(details[i].length() - 3) > '0') count++;
            else if(details[i].charAt(details[i].length() - 4) > '6') count++;
        return count;
    }
}

/*
int count = 0;
        for(int i=0; i<details.length; i++){
           String s = details[i];
            if((((int)(s.charAt(11)-'0')*10)+((int)(s.charAt(12)-'0')))>60){
                count++;
            }
        }
        return count;
*/
