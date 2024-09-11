/* Link - https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1 */

class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[]) 
    {
        // your code here
        PriorityQueue<Long>minheap = new PriorityQueue<>();
        for(long length :arr){
            minheap.add(length);
        }
         long totalcost = 0;
         while(minheap.size()>1){
             long first = minheap.poll();
             long second = minheap.poll(); // taking out 2 min elements 
             long sum = first+second;
             minheap.add(sum);
             totalcost+=sum;
             
         }
         
         return totalcost;
        
    }
}
