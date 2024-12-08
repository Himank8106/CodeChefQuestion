/* Link - https://www.geeksforgeeks.org/problems/overlapping-intervals--170633/1 */

class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        Arrays.sort(arr, (x,y)->x[0]-y[0]);
        List<int[]> li = new ArrayList<>();
        int i=0, j=0, n=arr.length;
        while(i<n){
            j=i+1;
            int x = arr[i][1];
            while(j<n && arr[j][0]<=x){
                x = Math.max(x,arr[j][1]);
                j++;
            }
            li.add(new int[]{arr[i][0], x});
            i=j;
        }
        return li;
    }
}
