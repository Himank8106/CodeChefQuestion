/* Link - https://www.interviewbit.com/problems/evaluate-expression/ */

public class Solution {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<A.size(); i++){
            String c = A.get(i);
            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
                int n1 = st.pop(), n2 = st.pop();
                if(c.equals("+")) st.push(n2+n1);
                else if(c.equals("-")) st.push(n2-n1);
                else if(c.equals("*")) st.push(n2*n1);
                else if(c.equals("/")) st.push(n2/n1);
            } else{
                int n = Integer.parseInt(c);
                st.push(n);
            }
        }
        return st.pop();
    }
}
