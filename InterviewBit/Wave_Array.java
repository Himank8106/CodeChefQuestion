/* Link - https://www.interviewbit.com/problems/wave-array/ */

public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=0; i<A.size()-1; i+=2){
            Collections.swap(A, i, i+1);
        }
        return A;
    }
}
