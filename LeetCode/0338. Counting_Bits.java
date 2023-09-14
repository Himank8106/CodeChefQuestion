/* Link - https://leetcode.com/problems/counting-bits/ */

class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i <= n; i++) {
            result[i] = Integer.bitCount(i);
        }
        return result;
    }
}

/* 
int result[] = new int[n+1];
        result[0] = 0;
        for(int i=0;i<=n;i++) {
            result[i] = result[i/2] + i%2;
        }
        return result;
*/

/* 
int[] arr = new int[n+1];
        for(int i=0; i<=n; i++){
            String s = Integer.toBinaryString(i);
            int count = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)=='1'){
                    count++;
                }
            }
            arr[i] = count;
            count = 0;
        }
        return arr;
*/
