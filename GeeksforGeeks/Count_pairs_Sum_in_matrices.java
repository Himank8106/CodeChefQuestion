/* Link - https://www.geeksforgeeks.org/problems/count-pairs-sum-in-matrices4332/1 */

class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        int pairs = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int[] arr: mat2){
            for(int b: arr){
                hs.add(b);
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(hs.contains(x-mat1[i][j])) pairs++;
            }
        }
        return pairs;
    }
}
