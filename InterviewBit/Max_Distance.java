/* Link - https://www.interviewbit.com/problems/max-distance/ */

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public int maximumGap(final int[] arr) {
       
       PriorityQueue<Pair> pq=  new PriorityQueue<>((a,b) -> a.val - b.val);
        for(int i=0;i<arr.length;i++){
           
            pq.add(new Pair(arr[i], i));
        }
        int min =arr.length;
        int ans =0;
        while(pq.size() >0){
            Pair pair= pq.poll();
            min = Math.min(min, pair.idx);
            ans =Math.max(ans, pair.idx - min);
           
        }
        return ans;
    }
}
class Pair{
    int val;
    int idx;
    Pair(int val, int idx){
        this.val = val;
        this.idx = idx;
    }
}
