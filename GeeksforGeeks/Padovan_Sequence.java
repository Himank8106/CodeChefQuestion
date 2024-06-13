/* Link - https://www.geeksforgeeks.org/problems/padovan-sequence2855/1 */

class Solution
{
  public int padovanSequence(int n)
    {
        //code here.
        int sum=0, a, b, c;
        a=b=c=1;
        if(n<3) return 1;
        for(int i=3; i<=n; i++){
            sum = (a+b)%1000000007;
            a=b;
            b=c;
            c=sum;
        }
        return sum;
    }
}
