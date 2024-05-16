/* Link - https://www.interviewbit.com/problems/subarray-with-b-odd-numbers/ */

public class Solution {
    public int solve(int[] A, int B) { 
        return atmost(A, B) - atmost(A, B-1); // we want to print atmost b odd nums 
    }

    public int atmost(int[] arr, int B){
        int n = arr.length;
       // if(B < 0) return 0;
        int st = 0;
        int end = 0;
        int count = 0;
        int res = 0;
  while(end < n){ //expansion
   if(arr[end] % 2 == 1) count++;
            end++;
     while(st < end && count > B){
           if(arr[st] % 2 == 1){
                    count--;
                }
                st++;
            }
            res += end - st;
        }
        return res;
    }
}
