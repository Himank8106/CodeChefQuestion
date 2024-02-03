/* Link - https://www.interviewbit.com/problems/add-one-to-number/ */

public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        for(int i=A.size()-1; i>=0; i--){
            if(A.get(i)==9){
                A.set(i,0);
            }
            else{
                A.set(i, A.get(i)+1);
                break;
            }
            if(i==0) A.add(0,1);
        }
        ListIterator<Integer> li = A.listIterator();
        while(li.hasNext()){
            if(li.next()==0) li.remove();
            else break;
        }
        return A;
    }
}
