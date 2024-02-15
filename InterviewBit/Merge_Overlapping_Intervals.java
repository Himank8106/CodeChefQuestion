/* Link - https://www.interviewbit.com/problems/merge-overlapping-intervals/ */

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        
        if (intervals == null) return null;
        
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        
        int i = 0;
        Interval current;
        Interval to_merg;
        while(i < intervals.size() - 1){
            current = intervals.get(i);
            to_merg  = intervals.get(i + 1);
            if(current.end < to_merg.start){
                i++;
                continue;
            }else if(current.start > to_merg.end){
                intervals.add(i, to_merg);
                
            }else{
                to_merg.start = Math.min(current.start, to_merg.start);
                to_merg.end = Math.max(current.end, to_merg.end);
                intervals.remove(i);
            }
        }
        return intervals;
    }
}
