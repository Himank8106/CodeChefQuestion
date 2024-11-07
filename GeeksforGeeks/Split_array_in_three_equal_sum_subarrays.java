/* Link - https://www.geeksforgeeks.org/problems/split-array-in-three-equal-sum-subarrays/1 */

class Solution {

    public List<Integer> findSplit(int[] arr) {
        // Return an array of possible answer, driver code will judge and return true or
        // false based on
        List<Integer> al = new ArrayList<>();
        int sum = 0;
        for(int x: arr) sum += x;
        if(sum%3!=0) return Arrays.asList(-1,-1);
        int res = sum/3;
        sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum==res){
                al.add(i);
                sum = 0;
                if(al.size()==2) return al; 
            }
        }
        return Arrays.asList(-1,-1);
    }
}
