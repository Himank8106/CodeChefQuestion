/* Link - https://www.geeksforgeeks.org/problems/single-number1014/1 */

class Solution {
    int getSingle(int arr[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i))
            map.put(i,map.get(i)+1);
            else
            map.put(i,1);
        }
        Set<Integer> set =map.keySet();
        for(int i:set){
            if(map.get(i)%2!=0){
                return i;
            }
        }
        return -1;
    }
}
