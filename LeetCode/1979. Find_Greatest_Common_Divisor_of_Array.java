/* Link - https://leetcode.com/problems/find-greatest-common-divisor-of-array/ */

class Solution {
    public int findGCD(int[] nums) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MIN_VALUE;

        for (int num : nums) {
            x = Math.min(x, num);
            y = Math.max(y, num);
        }
        return gcd(x,y);
    }
    public int gcd(int x, int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
}

/* 
public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        while(a>0){
            if(nums[0]%a==0 && nums[nums.length-1]%a==0){
                break;
            }
            else{
                a--;
            }
        }
        return a;
    }
*/
