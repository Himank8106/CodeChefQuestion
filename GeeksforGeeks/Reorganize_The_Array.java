/* Link - https://www.geeksforgeeks.org/problems/reorganize-the-array4810/1 */

class Solution {
   public List<Integer> rearrange(List<Integer> arr) {
        int count = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==-1 || arr.get(i)==i)continue;
            
            int ind = arr.get(i);
            arr.set(i,-1);
            while(ind!=-1 && count<arr.size()){
                int temp = arr.get(ind);
                arr.set(ind,ind);
                ind = temp;
                count++;
            }
        }
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=i && arr.get(i)!=-1){
                arr.set(i,-1);
            }
        }
        return arr;
    }
}
