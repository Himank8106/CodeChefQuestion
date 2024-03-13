/* Link - https://www.geeksforgeeks.org/problems/print-matrix-in-diagonal-pattern/1 */

class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n=mat.length;
        int arr[]=new int[n*n];
        int pos=0;
       for(int i=0;i<n;i++){
           if(i%2==0){
               for(int j=i,k=0;j>=0;j--,k++){
                   arr[pos++]=mat[j][k];
               }
           }else{
                for(int j=0,k=i;j<=i;j++,k--){
                    arr[pos++]=mat[j][k];
                }
           }
       }
       for(int i=1;i<n;i++){
           if(n%2==0){
                if(i%2==1){
                    for(int j=n-1,k=i;j>=i;j--,k++){
                        arr[pos++]=mat[j][k];
                    }
                }else{
                    for(int j=i,k=n-1;j<n;j++,k--){
                        arr[pos++]=mat[j][k];
                    }
                }
           }else{
               if(i%2==1){
                   for(int j=i,k=n-1;j<n;j++,k--){
                       arr[pos++]=mat[j][k];
                   }
               }else{
                   for(int j=n-1,k=i;j>=i;j--,k++){
                       arr[pos++]=mat[j][k];
                   }
               }
           }
       }
       return arr;
    }
}
