/* Link - https://leetcode.com/problems/remove-outermost-parentheses/ */

class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                if(st.size()>0){
                    sb.append(s.charAt(i));
                }
                st.push(s.charAt(i));
            }
            else{
                st.pop();
                if(st.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return String.valueOf(sb);
    }
}

  

/* 
StringBuilder sb = new StringBuilder();
        int open = 0;
        for(char c : s.toCharArray()){
            if(c=='(' && open++ > 0) sb.append(c);
            if(c==')' && open-- > 1) sb.append(c);
        }
        return sb.toString();
*/
