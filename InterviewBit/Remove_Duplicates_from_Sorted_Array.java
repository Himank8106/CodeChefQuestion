/* Link - https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/ */
  
public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        Set<Integer> set = new HashSet<>(a.size());
        a.removeIf(p -> !set.add(p));
        return a.size();
    }
}

