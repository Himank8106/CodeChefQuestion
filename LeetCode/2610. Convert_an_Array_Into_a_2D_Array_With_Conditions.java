/* Link - https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/ */

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int arr[]=new int[nums.length+1];
        Arrays.fill(arr,-1);
        List<Integer> l=new ArrayList<>();
        ans.add(l);
        int size=1;
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]==-1){
            l.add(nums[i]);
                arr[nums[i]]=0;
            }
            else{
                boolean ref=false;
                for(int k=0;k<ans.size();k++){
                    List<Integer> lo=ans.get(k);
                    if(!lo.contains(nums[i])){
                        lo.add(nums[i]);
                        arr[nums[i]]=0;
                        ref=true;
                        break;
                    }
                }
                if(ref==false){
                List<Integer> ll=new ArrayList<>();
                ll.add(nums[i]);
                arr[nums[i]]=0;
                    ans.add(ll);
                    size++;
                }
            }
        }
        return ans; 
    }
}
