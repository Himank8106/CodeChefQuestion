/* Link - https://www.interviewbit.com/problems/hotel-service/ */

public class Solution {
    public ArrayList<Integer> nearestHotel(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
             int height = A.size();
        int width = A.get(0).size();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Queue<int[]> q = new LinkedList();
        int[][] dist = new int[height][width];

        for(int row=0;row<height;row++) {
            for(int col=0;col<width;col++) {
                if(A.get(row).get(col) == 1) {
                    q.add(new int[] {row, col});
                }
            }
        }
        int[][] dir = new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
        while(!q.isEmpty()) {
            int sz = q.size();
            for(int time=0;time<sz;time++) {
                int[] pair = q.poll();
                for(int[] d:dir) {
                    int newRow = pair[0] + d[0];
                    int newCol = pair[1] + d[1];
                    if(newRow >= 0 && newCol >= 0 && newRow < height && newCol < width && dist[newRow][newCol] == 0 && A.get(newRow).get(newCol) == 0) {
                        dist[newRow][newCol] = dist[pair[0]][pair[1]] + 1;
                        q.add(new int[] {newRow, newCol});
                    }
                }
            }
        }
        for(List<Integer> ele:B) {
            ans.add(dist[ele.get(0)-1][ele.get(1)-1]);
        }

        return ans;
    }
}
