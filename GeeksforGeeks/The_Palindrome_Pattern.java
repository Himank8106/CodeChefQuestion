/* Link - https://www.geeksforgeeks.org/problems/the-palindrome-pattern3900/1 */

class Solution {
    public String pattern(int[][] arr) {
        // Code here
        for(int i=0;i<arr.length;i++){
            String a="";
            for(int j=0;j<arr[0].length;j++){
                a+=arr[i][j];
            }
            if(pal(a)){
                return i + " R";
            }
        }
        for(int i=0;i<arr[0].length;i++){
            String a="";
            for(int j=0;j<arr.length;j++){
                a+=arr[j][i];
            }
            if(pal(a)){
                return i + " C";
            }
            
        }
        return "-1";
    }
    public boolean pal(String s){
        int j=s.length();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(j-1-i)){
                return false;
            }
            
        }
        return true;
    }
}
