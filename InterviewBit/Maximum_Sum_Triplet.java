/* Link - https://www.interviewbit.com/problems/maximum-sum-triplet/ */

public class Solution {
    public static int solve(ArrayList<Integer> A) {
int max = 0, n = A.size();
// creating a suffix array where we store max k for every i and j
int suffix[] = new int[n];
for (int i = n - 1; i >= 0; i--) {
// initially last element is stored in suffix array then we will compare the ith
// element from A with i+1 element of Suffix array
if (i == n - 1) {
suffix[i] = A.get(i);
} else {
suffix[i] = A.get(i) > suffix[i + 1] ? A.get(i) : suffix[i + 1];
}
}
TreeSet<Integer> set = new TreeSet<Integer>();
set.add(A.get(0));
for (int j = 1; j < n; j++) {
set.add(A.get(j));
int sum = 0;
// calc sum for every index with its previous lower and max possible k from
// suffix
if (A.get(j) != set.first() && suffix[j] != A.get(j)) {
sum += set.lower(A.get(j)) + A.get(j) + suffix[j];
}
// max sum will be stored and returned.
max = max > sum ? max : sum;
}
return max;
}
}
