/* Link - https://www.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1 */

class Solution {
    public int[] FindExitPoint(int n, int m, int[][] arr) {
        // code here
        int[] ex = new int[2];
        int i = 0;
        int j = 0;
        int rdir = 0;
        int cdir = 1;
        while(i < n && j < m && i >= 0 && j >=0){
            if(arr[i][j] == 1){
                arr[i][j] = 0;
                if(rdir == 0 && cdir == 1){
                    rdir = 1;
                    cdir = 0;
                }
                else if(rdir == 1 && cdir == 0){
                    rdir = 0;
                    cdir = -1;
                }
                else if(rdir == 0 && cdir == -1){
                    rdir = -1;
                    cdir = 0;
                }
                else if(rdir == -1 && cdir == 0){
                    rdir = 0;
                    cdir = 1;
                }
            }
            ex[0] = i;
            ex[1] = j;
            i+=rdir;
            j+=cdir;
        }
        return ex;
    }
}
