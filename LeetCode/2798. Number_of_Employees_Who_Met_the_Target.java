/* Link - https://leetcode.com/problems/number-of-employees-who-met-the-target/ */

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i:hours)
        {
            if(i>=target)
            {
                count++;
            }
        }
        return count;
    }
}
