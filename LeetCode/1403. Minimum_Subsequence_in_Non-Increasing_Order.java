/* Link - https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/ */

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] array = new int[100];
        int sum = 0;

        for (int i : nums) {
            array[i - 1]++;
            sum += i;
        }

        for (int i = array.length - 1, limit = sum / 2 + sum % 2; i >= 0 && sum >= limit; i--) {
            while (array[i] > 0 && sum >= limit) {
                result.add(i + 1);
                sum -= i + 1;
                array[i]--;
            }
        }

        return result;
    }
}

/* 
int n = nums.length, sum=0, s=0;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            sum += nums[i];
        }
        List<Integer> li = new ArrayList<>();
        for(int j=n-1; j>=0; j--){
            s += nums[j];
            sum -= nums[j];
            li.add(nums[j]);
            if(s>sum) break;
        }
        return li;
*/

 
