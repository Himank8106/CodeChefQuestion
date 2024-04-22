/* Link - https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1 */

class Solution {
    int minRow(int n, int m, int a[][]) {
        int mini = Integer.MAX_VALUE, row = -1;
        
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int num: a[i])
                if(num == 1)
                    count++;
                    
            if(count < mini) {
                mini = count;
                row = i;
            }
        }
        
        return row + 1;
    }
};
