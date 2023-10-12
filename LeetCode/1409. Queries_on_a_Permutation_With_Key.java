/* Link - https://leetcode.com/problems/queries-on-a-permutation-with-key/ */

class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] ans = new int[queries.length];
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1; i<=m; i++){
            al.add(i);
        }
        for(int i=0; i<queries.length; i++){
            ans[i] = al.indexOf(queries[i]);
            al.remove(al.indexOf(queries[i]));
            al.add(0, queries[i]); 
        }
        return ans;
    }
}

// class Solution {
//     public int[] processQueries(int[] queries, int m) {
//         int[] arr = new int[m];
//         for (int i = 0; i < m; i++) {
//             arr[i] = i + 1;
//         }
        
//         for (int i = 0; i < queries.length; i++) {
//             queries[i] = findIndex(arr, queries[i]);        
//         }   
//         return queries;
//     }
    
//     private int findIndex(int[] arr, int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 updateIndexing(arr, i, target);
//                 return i;
//             }
//         }
//         return 0;
//     } 

//     private void updateIndexing(int[] arr, int i, int target) {
//         for (int j = i; j > 0; j--) {
//             arr[j] = arr[j-1];
//         }
//         arr[0] = target;
//     }
// }


