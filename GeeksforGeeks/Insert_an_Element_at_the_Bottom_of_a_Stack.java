/* Link - https://www.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1 */

class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
        } else {
            int temp = st.pop();
            insertAtBottom(st, x);
            st.push(temp);
        }
        return st;
    }
}
