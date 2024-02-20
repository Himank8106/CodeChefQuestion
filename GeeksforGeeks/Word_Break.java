/* Link - https://www.geeksforgeeks.org/problems/word-break1352/1 */

class Solution
{
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        //code here
        //code here
        int arr[]=new int[s.length()];
        for(String str:dictionary){
             int idx = s.indexOf(str);
             while (idx != -1) {
                for(int i=idx;i<idx+str.length();i++){
                     arr[i]=1;
                }
                idx = s.indexOf(str, idx + 1);
             }
        }
        for(int i=0;i<s.length();i++){
            if(arr[i]==0){
                return 0;
            }
        }
        return 1;
    }
}
