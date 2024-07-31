/* Link - https://www.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1 */

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        String prefix = arr[0];
        if(prefix == null || prefix.length()==0) return "-1";
        for(int i=1; i<arr.length; i++){
            while(arr[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.length()==0) return "-1";
            }
        }
        return prefix;
    }
}
