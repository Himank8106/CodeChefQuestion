/* Link - https://www.geeksforgeeks.org/problems/pair-in-array-whose-sum-is-closest-to-x1124/1 */

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();
        if (arr.length < 2) {
            return result;
        }
        Arrays.sort(arr);
        int closestDiff = Integer.MAX_VALUE; 
        int maxAbsDiff = Integer.MIN_VALUE;  
        int left = 0, right = arr.length - 1;
        
        while (left < right) { 
            int sum = arr[left] + arr[right];
            int diff = Math.abs(target - sum);
            
            if (diff < closestDiff || (diff == closestDiff && (arr[right] - arr[left]) > maxAbsDiff)) {
            closestDiff = diff;
                maxAbsDiff = arr[right] - arr[left];
                result = Arrays.asList(arr[left], arr[right]);
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
