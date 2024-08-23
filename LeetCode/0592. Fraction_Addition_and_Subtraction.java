/* Link - https://leetcode.com/problems/fraction-addition-and-subtraction/ */

class Solution {
    public String fractionAddition(String expression) {
        expression = expression.replace("-","+-");
        String[] str = expression.split("\\+");
        int numer=0, denom=1;
        for(int i=0; i<str.length; i++){
            if(!str[i].isEmpty()){
                String[] s = str[i].split("/");
                int num = Integer.parseInt(s[0]);
                int den = Integer.parseInt(s[1]);
                numer = num*denom+numer*den;
                denom *= den;
                int gcd = gcd(Math.abs(numer), Math.abs(denom));
                numer /= gcd;
                denom /= gcd;
            }
           
        }
        return numer+"/"+denom;
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
