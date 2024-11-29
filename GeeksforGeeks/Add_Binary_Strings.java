/* Link - https://www.geeksforgeeks.org/problems/add-binary-strings3805/1 */

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        int i = 0, j = 0;
        while (i < s1.length() && s1.charAt(i) == '0') i++;
        while (j < s2.length() && s2.charAt(j) == '0') j++;
        s1 = s1.substring(i);
        s2 = s2.substring(j);
        int c=0;
        i = s1.length()-1;
        j = s2.length()-1;
        StringBuilder s = new StringBuilder();
        while(i>=0 || j>=0 || c>0){
            int x = (i>=0)?s1.charAt(i)-'0':0;
            int y = (j>=0)?s2.charAt(j)-'0':0;
            int sum = x+y+c;
            s.append(sum%2);
            c = sum/2;
            i--;
            j--;
        }
        return s.reverse().toString();
    }
}
