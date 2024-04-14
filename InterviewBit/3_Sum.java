/* Link - https://www.interviewbit.com/problems/3-sum/ */

public class Solution {
    public int threeSumClosest(int[] A, int B) {
        int n=A.length, minDiff=Integer.MAX_VALUE, closestSum=Integer.MAX_VALUE;
        Arrays.sort(A);
        for(int i=0; i<n-2; i++){
            int j=i+1, k=n-1;
            while(j<k){
                int sum = A[i]+A[j]+A[k];
                if(sum==B){
                    return sum;
                }
                else if(sum<B){
                    if(B-sum<minDiff){
                        minDiff = B-sum;
                        closestSum = sum;
                    }
                    j++;
                }
                else{
                    if(sum-B<minDiff){
                        minDiff = sum-B;
                        closestSum = sum;
                    }
                    k--;
                }
            }
        }
        return closestSum;
    }
}
