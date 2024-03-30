/* Link - https://www.interviewbit.com/problems/square-root-of-integer/ */

public class Solution {
    public int sqrt(int x) {
        long ans=-1;
        long A=x;
        long l=0,h=A;
        while(l<=h){
            long mid=(l+h)/2;
            long sqr=(mid*mid);
            if(sqr==A){
                return (int)mid;
            }
            else if(sqr<A){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return (int)ans;
    }
}
