/* Link - https://www.geeksforgeeks.org/problems/find-the-n-th-character5925/1 */

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        String str = "";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < n+1; j++) {
                if (s.charAt(j) == '1') {
                    str += "10";
                } else {
                    str += "01";
                }
            }
            s = str;
            if (i + 1 != r) {
                str = "";
            }
        }
        return str.charAt(n);
    }
}
