/* Link - https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1 */

class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        String reverse ="";
        String temp = "";
        for(int i= 0; i< str.length(); i++){
            if(str.charAt(i) !='.'){
                temp = temp +str.charAt(i);
            }else{
                reverse = '.'+temp + reverse;
                temp = "";
            }
        }
        return temp +reverse;
    }
}
