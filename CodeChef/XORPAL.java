/* Link - https://www.codechef.com/problems/XORPAL */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int n0=0, n1=0;
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='0') n0++;
                else n1++;
            }
            if((n0%2!=0) && (n1%2!=0) && (n0!=n1)) System.out.println("NO");
            else System.out.println("YES");
        }
	}
}
