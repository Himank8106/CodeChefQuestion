/* Link - https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1 */

class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr, (a,b) -> b.profit-a.profit);
        int max = 0, count=0, total=0;
        for(Job j:arr) max = Math.max(j.deadline, max);
        boolean[] flag =  new boolean[max+1];
        for(Job j:arr){
            for(int i=j.deadline; i>0; i--){
                if(flag[i]==false){
                    flag[i] = true;
                    count++;
                    total += j.profit;
                    break;
                }
            }
        }
        return new int[]{count, total};
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
