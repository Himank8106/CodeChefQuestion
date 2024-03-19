/* Link - https://leetcode.com/problems/task-scheduler/ */

class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
                return tasks.length;
        }
            int[] f = new int[26];
            for (char c : tasks) {
                f[c - 'A']++;
            }
            int max = 0;
            int count = 0;
            for (int i : f) {
                if (i > max) {
                    max = i;
                    count = 1;
                } else if (i == max) {
                    count++;
                }

            }
            return Math.max(tasks.length, (max - 1) * (n + 1) + count);        
    }
}



/* 
int[] freq = new int[26];
        for(char task: tasks){
            freq[task-'A']++;
        }
        Arrays.sort(freq);
        int last = freq[25]-1;
        int idle = last*n;
        for(int i=24; i>=0; i--){
            idle -= Math.min(last, freq[i]);
        }
        return idle<0?tasks.length:idle+tasks.length;
*/
