/* Link - https://leetcode.com/problems/maximum-odd-binary-number/ */

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int end = s.length(), numberOfOnes = - 1;
        //char[] arr = new char[s.length()];
        //insert 1 on the last
        for(int i = 0; i < s.length(); i++) {
            //get the numbers of 1
            if(s.charAt(i) == '1') numberOfOnes++;            
        }
        StringBuilder sb = new StringBuilder();    
        int start = numberOfOnes;
        while(numberOfOnes>0) {
            sb.append(1);
            numberOfOnes--;
        }
        
        while(start < end - 1) {
            sb.append(0);
            start++;
        }
        sb.append(1);
        return sb.toString();
    }
}

/* 
int a0 = 0, a1 = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                a0++;
            }
            else{
                a1++;
            }
        }
        String ans = "";
        while(a1>1){
            ans += "1";
            a1--; 
        }
        while(a0>0){
            ans += "0";
            a0--;
        }
        return ans+"1";
*/
