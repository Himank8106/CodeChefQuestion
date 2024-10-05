/* Link - https://www.geeksforgeeks.org/problems/smallest-number-subset1220/1 */

class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        long res=1;
        for(int i:arr){
            if(i>res){
               break;
            }
            res+=i;
            
        }
        return res;
    }
}
