/* Link - https://www.geeksforgeeks.org/problems/linked-list-of-strings-forms-a-palindrome/1 */

class Solution {
    public boolean compute(Node root) {
        if(root==null){
            return false;
        }
        String s = "";
        while(root!=null){
            s += root.data;
            root = root.next;
        }
        int i=0, j=s.length()-1;
        boolean b = true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                b = false;
                break;
            }
            i++;
            j--;
        }
        return b?true:false;
    }
}
