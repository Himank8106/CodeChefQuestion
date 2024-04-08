/* Link - https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array-ii/ */

public class Solution {
	public int removeDuplicates(ArrayList<Integer> A) {
    int index = 1;
    int count = 1;
    int n = A.size();
    for (int i = 1; i < n; i++) {
        if (A.get(i).intValue() == A.get(i - 1).intValue() && count < 2) {
            A.set(index, A.get(i));
            count++;
            index++;
        } else if (A.get(i).intValue() != A.get(i - 1).intValue()) {
            A.set(index, A.get(i));
            count = 1;
            index++;
        }
    }
    return index;
	}
}
