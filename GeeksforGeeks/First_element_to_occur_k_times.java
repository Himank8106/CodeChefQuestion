/* Link - https://www.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1 */

class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        int[] arr = new int[201];
        for(int i=0; i<a.length; i++){
            arr[a[i]] += 1;
            if(arr[a[i]] >= k){
                return a[i];
            }
        }
        return -1;
    } 
}
