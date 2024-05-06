/* Link - https://www.interviewbit.com/problems/2-sum/ */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            if(map.containsKey(B-A.get(i))){
                al.add(map.get(B-A.get(i)));
                al.add(i+1);
                return al;
            }
            else{
                if(map.containsKey(A.get(i))) continue;
                else map.put(A.get(i), i+1);
            }
        }
        return al;
    }
}
