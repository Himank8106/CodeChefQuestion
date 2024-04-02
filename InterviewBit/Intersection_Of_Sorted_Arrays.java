/* Link - https://www.interviewbit.com/problems/intersection-of-sorted-arrays/ */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
        ArrayList<Integer> ar = new ArrayList<>();
        int pa = 0;
        int pb = 0;
        while(pa < a.size() && pb < b.size()){
            int ta = a.get(pa);
            int tb = b.get(pb);
           
            if(ta < tb){
                pa++;
            }else if(ta > tb){
                pb++;
            }else{
                ar.add(ta);
                pa++;
                pb++;
            }
        }
        return ar;
    }
}
