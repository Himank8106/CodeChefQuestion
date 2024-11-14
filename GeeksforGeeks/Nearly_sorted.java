/* Link - https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/1 */ 

class Solution {
    // Non-static method, so you need to call it on an instance of the class
    public void nearlySorted(int[] arr, int k) {
        // code
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<=k; i++){
            pq.add(arr[i]);
        }
        for(int i=k+1; i<arr.length; i++){
            al.add(pq.poll());
            pq.add(arr[i]);
        }
        while(!pq.isEmpty()) al.add(pq.poll());
        for(int i=0; i<arr.length; i++){
            arr[i] = al.get(i);
        }
    }
}
