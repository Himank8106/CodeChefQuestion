/* Link - https://leetcode.com/problems/intersection-of-two-arrays/ */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        set1.retainAll(set2);
        
        int[] result = new int[set1.size()];
        int index = 0;
        for (int num : set1) {
            result[index++] = num;
        }
        
        return result;
    }
}

 
/* 
 Set<Integer> unqEle = new HashSet<>(), removedEle = new HashSet<>();
        for(var num : nums1){
            unqEle.add(num);
        }
        List<Integer> intersection = new ArrayList<>();
        for(var num : nums2){
            if(unqEle.contains(num) && !removedEle.contains(num)){
                intersection.add(num);
                removedEle.add(num);
            }
        }
        return intersection.stream().mapToInt(x->x).toArray();  
*/
