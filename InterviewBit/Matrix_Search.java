/* Link - https://www.interviewbit.com/problems/matrix-search/ */

public class Solution {
    public int searchMatrix(int[][] A, int B) {
        int low = 0;
        int high = A[0].length * A.length - 1;
        int mid = 0;
        int firstIndex;
        int secondIndex;
       
       
        while (low <= high) {
            mid = low + ((high - low)/2);
            firstIndex = mid/A[0].length;
            secondIndex = mid%A[0].length;

            if (A[firstIndex][secondIndex] == B) {
                //System.out.println(firstIndex);
                //System.out.println(secondIndex);
                return 1;
            }
            else if (A[firstIndex][secondIndex] < B) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return 0;
    }
}

        
/* 
 for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                if(A[i][j]==B) return 1;
            }
        }
        return 0;
*/
