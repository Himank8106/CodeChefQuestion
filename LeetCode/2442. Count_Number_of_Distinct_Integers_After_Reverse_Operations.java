/* Link - https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/ */

class Solution {
  public int countDistinctIntegers(int[] nums) {
    int count=0;
        boolean[] set = new boolean[1000001];
        for(int i=0;i<nums.length;i++){

            if(!set[nums[i]]){
                set[nums[i]]=true;
                count++;
            }
            int res=0;
            int n =nums[i];
            while(n>0){
            res*=10;
            res+=n%10;
            n=n/10;
        }

            if(!set[res]){
                set[res]=true;
                count++;
            }

        }
        

        return count;

    }
  }

 
        
// public static int rev(int n){
//         int rev = 0;
//         while(n>0){
//             rev = rev*10 + (n%10);
//             n /= 10;
//         }
//         return rev;
//     }
//     public int countDistinctIntegers(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         for(int x:nums){
//             set.add(x);
//             set.add(rev(x));
//         }
//         return set.size();
//     }
