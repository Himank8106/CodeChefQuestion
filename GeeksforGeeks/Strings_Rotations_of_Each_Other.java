/* Link - https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1 */

class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        StringBuilder temp = new StringBuilder();
        temp.append(s1);
        temp.append(s1);
        if(temp.lastIndexOf(s2) == -1) return false;
        else return true;
    }
}
