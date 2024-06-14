/* Link - https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1 */
  
class Solution {
    static String armstrongNumber(int n) {
        // code here
        int sum = 0, initial=n;
        while(n!=0){
            sum += Math.pow(n%10, 3);
            n /= 10;
        }
        return sum==initial?"true":"false";
    }
}
