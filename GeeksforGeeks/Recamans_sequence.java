/* Link - https://www.geeksforgeeks.org/problems/recamans-sequence4856/1 */

class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        int a0 = 0, ai=0;
        al.add(a0);
        for(int i=1; i<n; i++){
            ai = al.get(i-1)-i;
            if(ai>0 && !hs.contains(ai)){
                al.add(ai);
                hs.add(ai);
            } 
            else{
                al.add(al.get(i-1)+i);
                hs.add(al.get(i-1)+i);
            }
        }
        return al;
    }
}
