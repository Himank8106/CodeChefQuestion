/* class - https://www.geeksforgeeks.org/problems/subarray-range-with-given-sum0128/1 */

class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        int cnt=0, sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            int temp = sum-tar;
            if(hm.containsKey(temp)) cnt += hm.get(temp);
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return cnt;
    }
}
