/* Link - https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1 */

class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '{' || ch == '(' || ch == '['){
                st.push(ch);
            }
            else{
                if(ch == '}') ch = '{';
                if(ch == ')') ch = '(';
                if(ch == ']') ch = '[';
                if(!st.isEmpty() && st.peek() != ch){
                    return false;
                }
                else if(st.isEmpty()){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}
