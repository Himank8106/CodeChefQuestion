/* Link - https://www.geeksforgeeks.org/problems/count-the-elements1529/1 */

class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int ans [] = new int[q];
        int k = 0;
        for(int i : query){
            int val = a[i];
            int c = 0;
            for(int j : b){
                if(j <= val)c++;
            }
            ans[k++] = c;
        }
        return ans;
    }
}
