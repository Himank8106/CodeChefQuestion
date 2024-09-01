/* Link - https://www.geeksforgeeks.org/problems/max-sum-path-in-two-arrays/1 */

class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        int sum1 = 0, sum2 = 0, sum = 0;
        int i = 0, j = 0, n = arr1.size(), m = arr2.size();
        
        while(i < n && j < m) {
            if(arr1.get(i).equals(arr2.get(j))) {
                sum += Math.max(sum1 + arr1.get(i), sum2 + arr2.get(j));
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            } else if (arr1.get(i) < arr2.get(j)) {
                sum1 += arr1.get(i);
                i++;
            } else {
                sum2 += arr2.get(j);
                j++;
            }
        }
        
        while (i < n) {
            sum1 += arr1.get(i);
            i++;
        }
        
        while (j < m) {
            sum2 += arr2.get(j);
            j++;
        }
        
        sum += Math.max(sum1, sum2);
        return sum;
    }
}
