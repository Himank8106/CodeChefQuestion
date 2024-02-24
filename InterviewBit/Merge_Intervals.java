/* Link - https://www.interviewbit.com/problems/merge-intervals/ */

public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals,
    Interval newInterval) {
        if(newInterval == null)
            return intervals;
        
        
        ArrayList<Interval> mergeList = new ArrayList<>();
		mergeList.add(newInterval);

		for (int i = 0; i < intervals.size(); i++) {
			Interval inter = mergeList.remove(mergeList.size() - 1);
			Interval curr = intervals.get(i);

			if (inter.start > curr.end) {
				mergeList.add(curr);
				mergeList.add(inter);
			} else if (inter.end < curr.start) {
				mergeList.add(inter);
				mergeList.add(curr);
			} else {
				int start = Math.min(inter.start, curr.start);
				int end = Math.max(inter.end, curr.end);
				mergeList.add(new Interval(start, end));
			}
		}

		return mergeList;
    }
}
