/* Link - https://leetcode.com/problems/maximum-units-on-a-truck/ */

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] s = new int[1001];
        for(int[] x: boxTypes) {
            s[x[1]] += x[0];
        }
        int res = 0;
        for(int pos = 1000; pos > 0 && truckSize > 0; pos --) {
            int min = Math.min(s[pos], truckSize);
            res += min * pos;
            truckSize -= min;
        }
        System.gc();
        return res;
    }
}
        
/* 
int[] arr=new int[1001];
        for (int[] box:boxTypes)
        {
            arr[box[1]]+=box[0];
        }
        int cnt = 0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i] == 0) 
            continue;
            int n=Math.min(arr[i],truckSize);
            cnt+=n*i;
            truckSize-=n;
            if(truckSize==0) 
            break;
        }
        return cnt;
*/

/* 
Arrays.sort(boxTypes, (a,b) -> Integer.compare(a[1], b[1]));
        int ans = 0;
        for(int i=boxTypes.length-1; i>=0; i--){
            if(truckSize == 0){
                return ans;
            }
            if(boxTypes[i][0] <= truckSize){
                ans += boxTypes[i][0]*boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else{
                ans += truckSize*boxTypes[i][1];
                truckSize = 0;
            }
        }
        return ans;
*/
