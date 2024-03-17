/* Link - https://leetcode.com/problems/insert-interval/ */

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        int[][] arr = new int[result.size()][2];
        for (int j = 0; j < result.size(); j++) {
            arr[j] = result.get(j);
        }
        return arr;
    }
}

// class Solution {
//     public int[][] insert(int[][] intervals, int[] newInterval) {
//         List<int[]> li = new ArrayList<>();
//         for(int[] interval: intervals){
//             li.add(interval);
//         }
//         li.add(newInterval);
//         li.sort((a,b) -> Integer.compare(a[1], b[1]));
//         List<int[]> list = new ArrayList<>();
//         list.add(li.get(0));
//         for(int i=1; i<li.size(); i++){
//             int currEnd = li.get(i)[1];
//             int currStart = li.get(i)[0];
//             while(list.size()>0 && list.get(list.size()-1)[1]>=currStart){
//                 currEnd = Math.max(list.get(list.size()-1)[1], currEnd);
//                 currStart = Math.min(list.get(list.size()-1)[0], currStart);
//                 list.remove(list.size()-1);
//             }
//             list.add(new int[]{currStart, currEnd});
//         }
//         return list.toArray(new int[list.size()][]);
//     }
// }
