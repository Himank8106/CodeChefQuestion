/* Link - https://www.geeksforgeeks.org/problems/juggler-sequence3930/1 */

class Solution {
    static List<Long> jugglerSequence(long n) {
        // code here
        List<Long> list=new ArrayList<>();
        list.add(n);
        while(n!=1){
            n=(n%2==0)?(long)Math.pow(n,1.0/2.0):(long)Math.pow(n,3.0/2.0);
            list.add(n);
        }
        return list;
    }
}
