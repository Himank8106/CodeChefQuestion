/* Link - https://www.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1 */

class Solution {
    String removeDuplicates(String str) {
        String s = "";
        for(int i=0; i<str.length(); i++){
            if(s.indexOf(str.charAt(i)) == -1){
                s += str.substring(i,i+1);
            }
        }
        return s;
    }
}

