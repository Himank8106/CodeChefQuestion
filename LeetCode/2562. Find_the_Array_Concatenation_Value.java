/* Link - https://leetcode.com/problems/find-the-array-concatenation-value/ */

class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long total = 0;
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            total += (i == j) ? nums[i] : concatenate(nums[i], nums[j]);
            i++;
            j--;
        }

        return total;
    }

    private int concatenate(int a, int b) {
        int temp = b;
        while (temp > 0) {
            a *= 10;
            temp /= 10;
        }
        return a + b;
    }
}

/* 
long ans=0;
        int i=0, j=nums.length-1;
        StringBuilder sb = new StringBuilder();
        while(j>=i){
            if(j==i) sb.append(nums[i]);
            else sb.append(nums[i]).append(nums[j]);
            int temp = Integer.parseInt(sb.toString());
            sb.setLength(0);
            ans += temp;
            j--; i++; 
        }
        return ans;
*/
