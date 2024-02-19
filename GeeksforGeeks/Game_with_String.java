/* Link - https://www.geeksforgeeks.org/problems/game-with-string4100/1 */

class Solution{
    static int minValue(String s, int k){
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;
            
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0)
                pq.add(freq[i]);
        }
            
        while(!pq.isEmpty() && k > 0) {
            int t = pq.peek();
            pq.poll();
            pq.add(t - 1);
            k--;
        }
        
        int sum = 0;
        while(!pq.isEmpty()) {
            int t = pq.peek();
            pq.poll();
            sum += Math.pow(t, 2);
        }
        
        return sum;
    }
}
