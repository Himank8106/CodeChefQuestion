/* Link - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/ */

class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            int count = 0;
            while(nums[i]>0){
                nums[i] /= 10;
                count++;
            }
            if(count%2==0){
                sum++;
            }
        }
        return sum;
    }
}

/* 
int temp = 0;
        for(int i=0 ; i<nums.length ; i++){
            //temp = 0 ; 
            if(nums[i]<10){
                ;
            }
            else if(nums[i]<100){
                temp+=1;
            }
            else if(nums[i]<1000){
                ;
            }
            else if(nums[i]<10000){
                temp +=1;
            }
            else if(nums[i]==100000){
                temp+=1;
            }  
        }
        return temp ;
*/
