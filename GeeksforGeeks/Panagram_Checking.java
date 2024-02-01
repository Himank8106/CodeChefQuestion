/* Link - https://www.geeksforgeeks.org/problems/pangram-checking-1587115620/1 */

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        boolean b[] = new boolean[26];
        char[] c = s.toCharArray();
        for(char t: c){
            if(Character.isLetter(t)){
                b[Character.toLowerCase(t) - 'a'] = true;
            }
        }
        for(boolean res: b){
            if(!res) return false;
        }
        return true;
    }
}
