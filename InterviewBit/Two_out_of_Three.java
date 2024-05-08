/* Link - https://www.interviewbit.com/problems/two-out-of-three/ */

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        TreeSet<Integer> ts = new TreeSet<>();
        Set<Integer> set = new HashSet<>(A);
        for(Integer i: B){
            if(A.contains(i)) ts.add(i);
            if(!ts.contains(i)) set.add(i);
        }
        for(Integer j: C){
            if(set.contains(j)){
                ts.add(j);
                set.remove(j);
            }
        }
        return new ArrayList<Integer>(ts);
    }
}
