/* Link - https://leetcode.com/problems/number-complement/ */

class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0') s = s.substring(0,i)+'1'+s.substring(i+1,s.length()); 
            else s = s.substring(0,i)+'0'+s.substring(i+1,s.length());
        }
        // int j=0;
        // for(int i=s.length()-1; i>=0; i--){
        //     if(s.charAt(i)=='1') ans += Math.pow(2,j);
        //     j++;
        // }
        return Integer.parseInt(s,2);
    }
}

/* 
class Solution {
    public int findComplement(int num) 
    {
        int n = (int)(Math.pow(2, digits(num)) - 1); //calling digits(num) func (int)(2 ^ 3) = 8 - 1 = 7
        return n - num;                              //7 - 5 = 2
    }
    
    public static int digits(int n)
    {
        int c = 0;                  //c = 0
        while(n > 0)                //5 > 0, 2 > 0, 1 > 0
        {
            n = n / 2;              //n = 5/2 = 2, 2)2/2 = 1, 3)1/2 = 0
            c++;                    //c = 1, 2, 3
        }
        return c;                   //return 3
    }
}
*/

/*
class Solution {
    public int bitwiseComplement(int n) {
        int ans = 0;
        int compare = 0;
        if(n == 0)
            return 1;
        while(n > 0) {
            if((n & 1) == 0) {
                ans += (int)Math.pow(2,compare);
            }
            n = n >> 1;
            compare++;
        }
        return ans;
    }
}
*/
