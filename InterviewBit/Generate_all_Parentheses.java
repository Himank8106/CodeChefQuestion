/* Link - https://www.interviewbit.com/problems/generate-all-parentheses/ */

public class Solution {
    public int isValid(String A) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> symbols = new HashMap<>();
        symbols.put(')', '(');
        symbols.put(']', '[');
        symbols.put('}', '{');
        for(int i=0; i< A.length(); i++){
            if(!stack.isEmpty() && symbols.keySet().contains(A.charAt(i))){
                if(stack.peek() != symbols.get(A.charAt(i)))
                    break;
                stack.pop();
            }else
                stack.push(A.charAt(i));
        }
        return stack.size() == 0 ? 1 : 0;
    }
}
