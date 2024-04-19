/* Link - https://www.geeksforgeeks.org/problems/in-first-but-second5423/1 */

class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < m; i++){
            set.add(b[i]);
        }
        for(int i = 0; i < n; i++){
            if(!set.contains(a[i])){
                al.add(a[i]);
            }
        }
        return al;
    }
}
