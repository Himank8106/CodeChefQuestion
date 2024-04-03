/* Link - https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/ */

public class Solution {
	public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		for (int i=0; i<b.size();i++) {
			a.add(0,b.get(i));
		}
		Collections.sort(a);
	}
}
