/* Link - https://www.interviewbit.com/problems/woodcutting-made-easy/ */

public class Solution {
    public  static int solve(int[] A, int B) {
 int n=A.length;
        int lo=0;  int hi=(int)1e6;
     
        while(lo<=hi){
              int mid = lo + (hi - lo) / 2;
           
            int res=check(A,mid,B);
            //return res;
            if(res==B){
                return mid;
            }
            if(res>B){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
           
         
        }
        return hi;
    }
   
    public static int check(int arr[],int mid,int B ){
        int chop=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid) chop+=(arr[i]-mid);
        }
        return chop;
    }}
