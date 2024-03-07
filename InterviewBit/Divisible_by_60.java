/* link - https://www.interviewbit.com/problems/divisible-by-60/ */

public class Solution {
    public int divisibleBy60(ArrayList<Integer> A) {
        boolean has_Zero = false; // has zeros ...
        boolean has_Even = false; // has even value...
        boolean has_Divd = false; // divisible by 3 ...
        
        if(A.size() < 2 && A.get(0) == 0) return 1;
        
        if(A.contains(0)) has_Zero = true;
        
        int sum = 0;
        for(int i=0; i<A.size(); i++){
            if(i != 0 && i % 2 == 0) has_Even = true;
           sum += A.get(i); 
        }
        
        if(sum % 3 == 0) has_Divd = true;
        
        if(has_Zero && has_Even && has_Divd) return 1;
        return 0;
    }
}
