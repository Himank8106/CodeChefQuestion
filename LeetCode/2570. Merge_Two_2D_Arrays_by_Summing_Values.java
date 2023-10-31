/* Link - https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/ */

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0;
        int j = 0;
        List<int[]> res = new ArrayList<>();
        while (i < nums1.length || j < nums2.length) {   
            if (i == nums1.length) {
                res.add(nums2[j++]);
            } else if (j == nums2.length) {
                res.add(nums1[i++]);  
            } else if (nums1[i][0] < nums2[j][0]) {
                res.add(nums1[i++]);
            } else if (nums1[i][0] > nums2[j][0]) {
                res.add(nums2[j++]); 
            } else {
                res.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }
        }
        return res.toArray(new int[0][0]);
    }
}

/* 
List<int[]> al = new ArrayList<>();
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0] == nums2[j][0]){
                al.add(new int[] {nums1[i][0], nums1[i][1]+nums2[j][1]});
                i++; j++;
            }
            else if(nums1[i][0] < nums2[j][0]){
                al.add(nums1[i]);
                i++;
            }
            else{
                al.add(nums2[j]);
                j++;
            }
        } 
        while(i<nums1.length){
            al.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            al.add(nums2[j]);
            j++;
        }
        int[][] arr = new int[al.size()][2];
        i=0;
        for(int[] a:al) arr[i++]=a;
        return arr;
*/

