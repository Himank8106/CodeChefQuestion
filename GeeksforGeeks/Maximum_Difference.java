/* Link - https://www.geeksforgeeks.org/problems/maximum-difference-1587115620/1 */

class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && st.peek()>=arr[i]) st.pop();
            if(!st.isEmpty()) left[i]=st.peek();
            else left[i]=0;
            st.push(arr[i]);
        }
        st.clear();
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()>=arr[i]) st.pop();
            if(!st.isEmpty()) right[i]=st.peek();
            else right[i]=0;
            st.push(arr[i]);
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            ans = Math.max(Math.abs(left[i]-right[i]), ans);
        }
        return ans;
    }
}

