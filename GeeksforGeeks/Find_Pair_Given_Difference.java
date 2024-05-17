/* Link - https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1 */

class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            if(set.contains(i-x) || set.contains(i+x)) return 1;
            set.add(i);
        }
        return -1;
    }
}
