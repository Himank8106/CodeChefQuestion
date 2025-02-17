/* Link - https://www.geeksforgeeks.org/problems/k-largest-elements4206/1 */

class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue <Integer> minHeap=new PriorityQueue<>(k);
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int num : arr)
        {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll(); 
        }

        
        while (!minHeap.isEmpty())
           result.add(minHeap.poll());
        
        Collections.reverse(result); 

        return result;
    }
}
