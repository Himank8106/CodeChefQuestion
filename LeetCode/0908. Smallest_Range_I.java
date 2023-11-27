/* Link - https://leetcode.com/problems/smallest-range-i/ */

class Solution {
    public int minOrMaxValueInArrInt(int[] input,String choose) {
		int ansMin = Integer.MAX_VALUE;
		int ansMax= Integer.MIN_VALUE;
		for(int i : input) {
			if(ansMin > i ) {
				ansMin = i;
			}
			else {
				continue;
			}
		}
		for(int i : input) {
			if(ansMax < i ) {
				ansMax = i;
			}
			else {
				continue;
			}
		}
		return (choose.equals("max")) ? ansMax : ansMin;
	}
	public int smallestRangeI(int[] nums, int k) {
        int diff = (minOrMaxValueInArrInt(nums, "max") - k) - (minOrMaxValueInArrInt(nums, "min")+k);

        return (diff>0) ? diff : 0;
    }
}


/*
int max, min;
        max=min=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);

        }
        int diff= (max-k)-(min+k);
        return (diff>0) ? diff : 0;
*/

