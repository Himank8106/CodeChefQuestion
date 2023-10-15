/* Link - https://leetcode.com/problems/count-symmetric-integers/ */

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = 1;i<=9;i++) {
            int y = i*10 + i;
            if(y > high) return count;
            if(y >= low) count++;
        }
        for(int i = 1;i<=9;i++)
            for(int j = 0;j <= 9;j++) {
                int left = Math.max(i+j-9, 0);
                int right = Math.min(i+j, 9);
                for(int k = left;k<=right;k++) {
                    int y = i*1000 + j * 100 + k*10 + i + j - k;
                    if(y>= low && y <= high) count++;
                }
            }
        return count;
    }
}

/*
int count = 0;
        for(int i=low; i<=high; i++){
            String s = Integer.toString(i); 
            String s1 = s.substring(0, s.length()/2);
            String s2 = s.substring(s.length()/2, s.length());
            int sum1 = 0, sum2 = 0;
            if(s.length()%2==0){
                for(int j=0; j<s1.length(); j++){
                    sum1 += s1.charAt(j)-'0';
                }
                for(int j=0; j<s2.length(); j++){
                    sum2 += s2.charAt(j)-'0';
                }
                if(sum1 == sum2){
                    count++;
                }
            }
        }
        return count;
*/
