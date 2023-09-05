/* Link - https://leetcode.com/problems/rings-and-rods/ */

class Solution {
    public int countPoints(String rings) {
        boolean[][] bol=new boolean[10][3];
        for(int i=1;i<rings.length();i+=2){
            char n=rings.charAt(i);
            char c=rings.charAt(i-1);
            if(c=='R')
                bol[n-'0'][0]=true;
            if(c=='G')
                bol[n-'0'][1]=true;
            if(c=='B')
                bol[n-'0'][2]=true;

        }
        int c=0;
        
        for(boolean[] b:bol )
            if(b[0]&&b[1]&&b[2])
                c++;
        
        return c;
    }
}
 
/* 
 int[] r = new int[10];
        int[] g = new int[10];
        int[] b = new int[10];

        for(int i=0; i<rings.length(); i+=2){
            int a = rings.charAt(i+1)-'0';
            if(rings.charAt(i)=='R'){
                r[a]++;
            }
            else if(rings.charAt(i)=='G'){
                g[a]++;
            }
            else{
                b[a]++;
            }
        }

        int count = 0;
        for(int i=0; i<10; i++){
            if(r[i]>0 && g[i]>0 && b[i]>0){
                count++;
            }
        }
        return count;
*/
