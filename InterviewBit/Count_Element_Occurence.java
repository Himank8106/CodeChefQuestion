/* Link - https://www.interviewbit.com/problems/count-element-occurence/ */

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int findCount(final int[] A, int B) {
        int start=0;
        int end = A.length-1;
        int count=0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(A[mid]==B){
                count =1;
                    for(int i=mid+1;i<=end;i++){
                       if(A[i]==B){
                           count++;
                       }
                       else{
                           break;
                       }  
                    }
                    for(int i=mid-1;i>=start;i--){
                        if(A[i]==B){
                            count++;
                        }
                        else{
                            break;
                        }
                    }
                return count;
            }
            else if(A[mid]<B){
                start = mid+1;
               
            }
            else{
                end = mid-1;
            }
        }
        return 0;
    }
}
