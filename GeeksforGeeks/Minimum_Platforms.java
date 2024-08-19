/* Link - https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1 */

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
     static int findPlatform(int arr[], int dep[], int n) {
        // Sort arrival and departure times
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        // Initialize platform count needed and the result
        int platforms_needed = 1, result = 1;
        int i = 1, j = 0;
        
        // Iterate over arrival and departure arrays
        while (i < n && j < n) {
            // If a train arrives before the last one departs, increase the platform count
            if (arr[i] <= dep[j]) {
                platforms_needed++;
                i++;
            }
            // If the train departs, decrease the platform count
            else {
                platforms_needed--;
                j++;
            }
            
            // Update the result with the maximum platforms needed at any time
            result = Math.max(result, platforms_needed);
        }
        
        return result;
    }
}
