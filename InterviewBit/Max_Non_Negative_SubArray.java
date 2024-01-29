/* Link - https://www.interviewbit.com/problems/max-non-negative-subarray/ */

public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> B =new ArrayList<Integer>();
        long newSum=0;
        long maxSum=0;
        int newLength=0,index=0,maxLength=0;
        for(int i=0;i<A.size();i++){
            if(i==A.size()-1 && A.get(i)>=0)
            {
                newSum=newSum+A.get(i);
                newLength++;
                if(newSum>=maxSum){
                    if(newSum>maxSum || newLength>maxLength){
                        maxLength=newLength;
                        index=i+1;
                    }
                    maxSum=newSum;
                }
                newLength=0;
                newSum=0;
               
            }
            else if(A.get(i)>=0){
                newSum=newSum+A.get(i);
                newLength++;
            }
            else{
                if(newSum>=maxSum){
                    if(newSum>maxSum || newLength>maxLength){
                        maxLength=newLength;
                        index=i;
                    }
                    maxSum=newSum;
                }
                newLength=0;
                newSum=0;
            }
           
        }
        for(int i=index-maxLength;maxLength>0;maxLength--,i++){
            B.add(A.get(i));
        }
        return B;
    }
}
