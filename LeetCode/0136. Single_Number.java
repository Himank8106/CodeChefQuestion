class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
		    for(int j=0; j<nums.length; j++){
		        ans^=nums[j];
		    }
		    return ans;
		
    }
}
