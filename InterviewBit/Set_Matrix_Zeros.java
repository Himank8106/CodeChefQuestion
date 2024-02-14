/* Link - https://www.interviewbit.com/problems/set-matrix-zeros/ */

public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();
        for(int i=0; i<a.size(); i++){
            for(int j=0; j<a.get(i).size(); j++){
                if(a.get(i).get(j)==0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for(Integer r:rows){
            for(int i=0; i<a.get(r).size(); i++){
                a.get(r).set(i,0);
            }
        }
        for(int i=0; i<a.size(); i++){
            for(Integer c: columns)
                a.get(i).set(c,0);
        }
	}
}
