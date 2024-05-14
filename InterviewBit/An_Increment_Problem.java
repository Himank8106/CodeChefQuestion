/* Link - https://www.interviewbit.com/problems/an-increment-problem/ */

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<A.size(); i++){
            if(!map.containsKey(A.get(i))){
                map.put(A.get(i),i);
            }else{
                Integer index = map.get(A.get(i));
                int num = A.get(i);
                map.remove(A.get(i));
                A.set(index,A.get(index)+1);
                map.put(A.get(index),index);
                if(!map.containsKey(num)){
                    for(int j=index; j<i; j++){
                        if(A.get(j)==num){
                            map.put(A.get(j),j);
                            break;
                        }
                    }
                }
                if(!map.containsKey(A.get(i))){
                    map.put(A.get(i),i);
                }
            }
        }
        return A;
    }
}
