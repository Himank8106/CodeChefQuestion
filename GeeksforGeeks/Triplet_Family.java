/* Link - https://www.geeksforgeeks.org/problems/triplet-family/1 */

class Solution {
    public boolean findTriplet(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        
        int n=arr.length;
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            int j=i+1;
            while(j<n){
                int sum=arr[i]+arr[j];
                if(list.contains(sum)){
                    return true;
                    
                }
                j++;
            }
        }
        return false;
    }
}
