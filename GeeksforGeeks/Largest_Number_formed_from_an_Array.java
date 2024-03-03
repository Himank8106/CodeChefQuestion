/* Link - https://www.geeksforgeeks.org/problems/largest-number-formed-from-an-array1117/1 */

class Solution {
    String printLargest(int n, String[] arr) {
        // code here
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String x, String y){
                String xy = x+y;
                String yx = y+x;
                return yx.compareTo(xy);
            }
        });
        String ans = "";
        for(int i=0; i<n; i++){
            ans += arr[i];
        }
        return ans;
    }
}
