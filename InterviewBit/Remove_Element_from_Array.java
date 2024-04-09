/* Link - https://www.interviewbit.com/problems/remove-element-from-array/ */

public class Solution {
	public int removeElement(ArrayList<Integer> a, int b) {
		int i=0,m=0;
        while(m<a.size()){
            int j=a.get(m);
            if(j==b){
                m++;
                }
            else{
                a.set(i,j);
                i++;m++;
            }
        }
        return i;
	}
}
