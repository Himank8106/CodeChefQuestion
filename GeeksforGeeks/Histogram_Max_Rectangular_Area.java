/* Link - https://www.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1 */

class Solution {
    public static int prevSmaller(int []arr , int i){
        for(int j = i ; j >= 0 ; j--){
            if(arr[i] > arr[j]){
                return j ; 
            }
        }
        return  -1 ;
    }
    public static int nextsmaller(int []arr ,int i){
        for(int j = i ; j<arr.length ; j++){
            if(arr[i] > arr[j]){
                return j ; 
            }
        }
        return arr.length ; 
    }
    public static int getMaxArea(int arr[]) {
        // your code here
        int rec = 0 ; 
        int larRec = 0   ;    
        for(int i = 0 ; i < arr.length ; i++){
            int nextSmall = nextsmaller(arr , i)  ;
            int prevSmall = prevSmaller(arr , i) ; 
            int area = nextSmall - prevSmall -1 ; 
            rec = arr[i] * area ; 
            larRec = Math.max(rec , larRec) ; 
        }
        return larRec ; 
    }
}
