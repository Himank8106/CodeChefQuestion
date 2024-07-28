/* Link - https://www.geeksforgeeks.org/problems/remove-duplicates3034/1 */

class Solution {
    String removeDups(String str) {
        // code here
        int[] arr = new int[26];
        String ans = "";
        for(int i=0; i<str.length(); i++){
            if(arr[str.charAt(i)-'a']==0){
                ans += String.valueOf(str.charAt(i));
                ++arr[str.charAt(i)-'a'];
            }
        }
        return ans;
    }
}
