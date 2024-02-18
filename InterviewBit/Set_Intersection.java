/* Link - https://www.interviewbit.com/problems/set-intersection/ */

import java.util.*;

public class Solution {
    public int setIntersection(int[][] A) {
        Arrays.sort(A, (a, b) -> {
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(b[0], a[0]);
        });
        
        int ans = 2;
        int[] p = {A[0][1]-1, A[0][1]};
        
        for(int i = 1; i < A.length; i++){
            int start = A[i][0];
            int end = A[i][1];
            
            if (start > p[1]){
                ans += 2;
                p[0] = end-1;
                p[1] = end;
            }
            else if (p[0] < start && p[1] >= start){
                p[0] = p[1];
                p[1] = end;
                ans++;
            }
        }
        
        return ans;
    }
}
