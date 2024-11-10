/* Link - https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-with-distinct-elements/1 */

class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer>ans=new ArrayList<>();
        HashSet<Integer>st=new HashSet<>();
        
        int i=0;
        int j=0;
        
        
        while(i<a.length){
            st.add(a[i]);
            i++;
        }
        
        while(j<b.length){
            st.add(b[j]);
            j++;
        }
        
        for(Integer e:st){
            ans.add(e);
        }
        
        Collections.sort(ans);
        
        return ans;
    }
}
