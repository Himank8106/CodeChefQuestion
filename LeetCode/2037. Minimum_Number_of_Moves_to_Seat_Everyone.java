/* link - https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/ */

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int ans = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0; i<seats.length; i++){
            ans += Math.abs(seats[i] - students[i]);
        }
        System.gc();
        return ans;
    }
}
