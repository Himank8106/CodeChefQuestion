/* Link - https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1 */

class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        int n1 = arr1.length, n2 = arr2.length;
        if(n1>n2) return kthElement(k, arr2, arr1);
        int low = Math.max(0, k-n2), high = Math.min(n1, k);
        while(low<=high){
            int cut1 = (low+high)/2, cut2 = k-cut1;
            int left1 = (cut1==0)?Integer.MIN_VALUE:arr1[cut1-1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];

            int right1 = (cut1 == n1) ? Integer.MAX_VALUE : arr1[cut1];
            int right2 = (cut2 == n2) ? Integer.MAX_VALUE : arr2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                return Math.max(left1, left2);
            } else if (left1 > right2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
        return -1;
    }
}
