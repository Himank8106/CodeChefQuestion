/* Link - https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1 */

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> hmap=new HashMap<>();
        int sum=0, fans=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)
                fans=Math.max(fans, i+1);
            if(!hmap.containsKey(sum))
                hmap.put(sum,i);
            if(hmap.containsKey(sum-k))
                fans=Math.max(fans, i-hmap.get(sum-k));
        }
        return fans;
    }
}
