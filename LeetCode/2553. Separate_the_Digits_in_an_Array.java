/* Link - https://leetcode.com/problems/separate-the-digits-in-an-array/ */

class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder s= new StringBuilder();
        for(int num:nums) 
        s.append(num);
        String t=s.toString();
        int[] res= new int[t.length()];
        for(int i=0;i<s.length();i++){
           res[i] =t.charAt(i)-'0';
            
        }
        System.gc();
        return res;
    }
}

/* 
ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            String s = nums[i]+"";
            for(int j=0; j<s.length(); j++){
                al.add(Integer.parseInt(s.charAt(j)+""));
            }
        }
        int ans[] = new int[al.size()];
        for(int i=0; i<al.size(); i++){
            ans[i] = al.get(i);
        }
        return ans;
*/

/* 
int size=0;

        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            while(temp > 0){
                temp=temp/10;
                size++;
            }
        }

        int[] ans=new int[size];
        int index=size-1;

        for(int i=nums.length-1;i>=0;i--){
            int temp=nums[i];

            while(temp>0){
                ans[index]=temp%10;
                index--;
                temp=temp/10;
            }
        }
       return ans; 
*/
