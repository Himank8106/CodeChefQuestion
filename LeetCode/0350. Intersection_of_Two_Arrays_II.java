/* Link - https://leetcode.com/problems/intersection-of-two-arrays-ii/ */

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        for (int num : nums1) {
            mp1.put(num, mp1.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            mp2.put(num, mp2.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int key: mp1.keySet()){
            if(mp2.containsKey(key)){
                int count = Math.min(mp1.get(key), mp2.get(key));
                for(int i=0; i<count; i++) al.add(key);
            }
        }
        int[] arr = new int[al.size()];         
        for(int k=0; k<al.size(); k++){
            arr[k] = al.get(k);
        }      
        return arr;
    }
}
