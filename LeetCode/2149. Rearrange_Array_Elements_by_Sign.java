/* Link - https://leetcode.com/problems/rearrange-array-elements-by-sign/ */

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int []ans=new int[n];
        int posIndex=0,negIndex=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
               ans[posIndex]=nums[i];
               posIndex+=2;
            }
            else{
               ans[negIndex]=nums[i];
               negIndex+=2;
            }
        }
        return ans;
    }
}


/* 
int[] ans = new int[nums.length];
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0) al1.add(nums[i]);
            else al2.add(nums[i]);
        }
        for(int i=0; i<al1.size(); i++){
            ans[2*i] = al1.get(i);  
            ans[2*i+1] = al2.get(i);
        }
        return ans;
*/
