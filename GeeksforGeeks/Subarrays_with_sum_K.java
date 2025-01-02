/* Link - https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1 */

class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0 ,ans=0;
        for(int val:arr){
            sum+=val;
            if(map.containsKey(sum-k))
                ans+=map.get(sum-k);
            if(map.containsKey(sum))
                map.put(sum,map.get(sum)+1);
            else
                map.put(sum,1);
        }
        return ans;
    }
}
