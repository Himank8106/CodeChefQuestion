/* Link - https://leetcode.com/problems/height-checker/ */

class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        List<Integer> exp = Arrays.stream(heights).boxed().collect(Collectors.toList());
        Collections.sort(exp);
        for(int i=0; i<heights.length; i++){
            if(heights[i] != exp.get(i)){
                count++;
            }
        }
        return count;
    } 
}

/* 
int freq[] = new int[101];
        int cnt = 0;
        int currHeight = 0;
        for(int h : heights) freq[h]++;
        for(int i=0; i<heights.length; i++){
            while(freq[currHeight] == 0) currHeight++;
            if(currHeight != heights[i]) cnt++;
            freq[currHeight]--;
        }
        return cnt;
*/

/* 
 int[] expected =  new int[heights.length];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]) {
                count++;
            }
        }
        return count;
*/
