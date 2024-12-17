/* Link - https://www.geeksforgeeks.org/problems/aggressive-cows/1 */

class Solution {
     public static boolean isPos(int[] a,int k,int minDis){
        int number=1;
        int last=a[0];
        
        for(int i=1;i<a.length;i++){
            if(a[i]-last >= minDis){
                number++;
                last=a[i];
            }
            if(number >= k)
                return true;
        }
        return false;
    }
    
    
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int ans=0;
        Arrays.sort(stalls);
        
        int n=stalls.length;
        int l=1;
        int h=stalls[n-1]-stalls[0];
        
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isPos(stalls,k,mid)){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
            
        }
        
        return ans;
    }
}
