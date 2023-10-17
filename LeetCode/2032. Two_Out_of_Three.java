/* Link - https://leetcode.com/problems/two-out-of-three/ */

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> li = new ArrayList<>();
        for (int num: nums1) {
            set.add(num);
        }
        for  (int num: nums2) {
            if (set.contains(num) && !li.contains(num)) li.add(num); 
            else set2.add(num);
        }
        for  (int num: nums3) {
            if ((set.contains(num) || set2.contains(num)) && !li.contains(num)) li.add(num); 
        }
        return li;
    }
}

/* 
List<Integer> l = new ArrayList<>();
        boolean[] b1 = new boolean[101];
        boolean[] b2 = new boolean[101];
        boolean[] b3 = new boolean[101];
        for(int num: nums1) b1[num] = true;
        for(int num: nums2) b2[num] = true;
        for(int num: nums3) b3[num] = true;
        for(int i=1; i<=100; i++){
            if((b1[i] || b2[i]) && (b2[i] || b3[i]) && (b3[i] || b1[i])){
                l.add(i);
            }
        }
        return l;
*/
