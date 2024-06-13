/* Link - https://www.interviewbit.com/problems/nearest-smaller-element/ */

public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            while(!st.isEmpty() && st.peek()>=A.get(i)){
                st.pop();
            }
            if(!st.isEmpty()) al.add(st.peek());
            else al.add(-1);
            st.push(A.get(i));
        }
        return al;
    }
}
