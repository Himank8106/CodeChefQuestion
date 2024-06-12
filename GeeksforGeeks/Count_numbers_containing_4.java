/* Link - https://www.geeksforgeeks.org/problems/count-numbers-containing-43022/1 */

class Solution {
    public static int countNumberswith4(int n) {
        // code here
        int count = 0;
        for(int i=1; i<=n; i++){
            String st = i+"";
            if(st.contains("4")) count++;
        }
        return count;
    }
}
