/* Link - https://www.interviewbit.com/problems/diffk-ii/ */

// public class Solution {
//     // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
//     public int diffPossible(final int[] A, int B) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         for(int i=0; i<A.length; i++){
//             arr.add(A[i]);
//         }
       
//         for(int i=0; i<A.length; i++){
//             if(arr.contains(A[i]+B) && i!=arr.indexOf(A[i]+B))
//                 return 1;
//         }
//         return 0;           
//     }
// }

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int diffPossible(final int[] A, int B) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : A) {
            if (set.contains(num - B) || set.contains(num + B)) {
                return 1;
            }
            set.add(num);
        }
        return 0;           
    }
}
