/* Link - https://www.geeksforgeeks.org/problems/nearest-multiple-of-102437/1 */

class Solution {

    String roundToNearest(String str) {
        // Complete the function
        int n=str.length();
        if(str.charAt(n-1)<='5'){
            str=str.substring(0,n-1)+"0";
            return str;
        }
        //str=str.substring(0,n-1)+"0";
        int i=n-2;
        while(i>=0 && str.charAt(i)=='9'){
            i--;
        }
        String s="";
        if(i<0){
            s="1";
            for(int j=0;j<n;j++){
                s+="0";
            }
            return s;
            //9997----10000
            
        }
            char ch= str.charAt(i);
            ch=(char)(ch+1);
            s= str.substring(0,i)+ch;
            for(int j=s.length();j<n;j++){
                s+="0";
            }
            return s;
    }
}
