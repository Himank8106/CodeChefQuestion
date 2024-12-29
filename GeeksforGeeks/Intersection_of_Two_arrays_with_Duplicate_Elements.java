/* Link - https://www.geeksforgeeks.org/problems/intersection-of-two-arrays-with-duplicate-elements/1 */

class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        HashSet<Integer> ans = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : a ){
            set.add(num);
        }
        for(int num : b){
            if(set.contains(num)){
                ans.add(num);
            }
        }
        return new ArrayList<>(ans);
    }
}
