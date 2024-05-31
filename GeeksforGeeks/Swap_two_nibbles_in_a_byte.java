/* Link - https://www.geeksforgeeks.org/problems/swap-two-nibbles-in-a-byte0446/1 */

class Solution {
    static int swapNibbles(int n) {
        // code here
        String s = Integer.toBinaryString(n);
        if(s.length()<8){
            while(s.length()<8){
                String s1 = "0"+s;
                s = s1;
            }
        }
        String s1 = s.substring(4,8)+s.substring(0,4);
        return Integer.parseInt(s1,2);
    }
}

/*
String s = String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');
String s1 = s.substring(4, 8) + s.substring(0, 4);
return Integer.parseInt(s1, 2);
*/
