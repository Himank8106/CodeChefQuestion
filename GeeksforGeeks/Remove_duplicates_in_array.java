/* Link - https://www.geeksforgeeks.org/problems/remove-duplicates-in-small-prime-array/1 */

class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        return list;
    }
}
