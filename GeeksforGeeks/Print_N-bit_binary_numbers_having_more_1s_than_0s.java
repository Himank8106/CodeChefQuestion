/* Link - https://www.geeksforgeeks.org/problems/print-n-bit-binary-numbers-having-more-1s-than-0s0252/1 */

class Solution {
    ArrayList<String> rec(String s, int i, int r, ArrayList<String> al){
        if(r==0){
            al.add(s);
            return al;
        }
        rec(s+"1",i+1,r-1,al);
        if(i>0){
            rec(s+"0",i-1,r-1,al);
        }
        return al;
    }
    ArrayList<String> NBitBinary(int N) {
        // code here
        ArrayList<String> al = new ArrayList<>();
        String s = "";
        rec(s,0,N,al);
        return al;
    }
}
