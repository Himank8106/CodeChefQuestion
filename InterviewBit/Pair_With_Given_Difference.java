/* Link - https://www.interviewbit.com/problems/pair-with-given-difference/ */

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int i=0,j=1;
        int n=A.size();
        while(i<n && j<n)
        {
            if(A.get(j)-A.get(i)==B && i!=j)
                return 1;
            else if(A.get(j)-A.get(i)<B)
                j++;
            else
                i++;
        }
        return 0;
    }
}
