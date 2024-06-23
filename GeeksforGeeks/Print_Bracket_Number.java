/* Link - https://www.geeksforgeeks.org/problems/print-bracket-number4058/1 */

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int j=1; 
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                st.push(j);
                al.add(j);
                j++;
            }
            else if(str.charAt(i)==')'){
                al.add(st.pop());
            }
        }
        return al;
    }
};
