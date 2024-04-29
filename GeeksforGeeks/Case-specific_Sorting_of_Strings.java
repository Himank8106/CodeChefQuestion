/* Link - https://www.geeksforgeeks.org/problems/case-specific-sorting-of-strings4845/1 */

class Solution {
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder bb = new StringBuilder();
        StringBuilder b = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if ((int)c >= 65 && (int)c <= 90) {
                sb.append(c);
            } else if ((int)c >= 97 && (int)c <= 122) {
                bb.append(c);
            }
        }

        char[] sortedSbChars = sb.toString().toCharArray();
        char[] sortedBbChars = bb.toString().toCharArray();
        Arrays.sort(sortedSbChars);
        Arrays.sort(sortedBbChars);

        int j = 0;
        int k = 0;
        for (char c : str.toCharArray()) {
            if ((int)c >= 65 && (int)c <= 90) {
                b.append(sortedSbChars[j]);
                j++;
            } else if ((int)c >= 97 && (int)c <= 122) {
                b.append(sortedBbChars[k]);
                k++;
            }
        }

        return b.toString();
    }
}
