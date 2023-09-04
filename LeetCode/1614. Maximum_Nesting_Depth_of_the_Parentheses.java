/* Link - https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/ */

class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int rsl = 0;
        char[] characters = s.toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char ch : characters) {
            if (ch == '(') {
                stack.push(ch);
                count++;
                rsl = Math.max(rsl, count);
            } else if (ch == ')') {
                stack.pop();
                count--;
            }
        }
        return rsl;
    }
}



/* 
int count=0, max=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                count++;
                if(count>max){
                    max = count;
                }
            }
            if(s.charAt(i)==')'){
                count--;
            }
        }
        return max;
*/
