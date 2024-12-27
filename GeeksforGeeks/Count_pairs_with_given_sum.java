/* Link - https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum--150253/1 */

class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count=0;
        for(int x: arr){
            if(hm.containsKey(target-x)){
                count += hm.get(target-x);
            } 
            hm.put(x, hm.getOrDefault(x,0)+1);
        }
        return count;
    }
}
