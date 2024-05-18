/* Link - https://www.geeksforgeeks.org/problems/find-the-highest-number2259/1 */

class Solution {
    public int findPeakElement(List<Integer> a) {
        // Code here
        int left=0, right=a.size()-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(a.get(mid)>a.get(mid+1)) right = mid;
            else left = mid+1;
        }
        return a.get(left);
    }
}
