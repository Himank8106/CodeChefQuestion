/* Link - https://www.codechef.com/problems/CHBLLNS */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		// your code goes here
        int t = sc.nextInt();
        while(t-->0){
            long r=sc.nextInt(), g=sc.nextInt(), b=sc.nextInt(), k=sc.nextInt();
            if(k==1) System.out.println(1);
            else System.out.println(Math.min(r,k-1)+Math.min(g,k-1)+Math.min(b,k-1)+1);
        }
	}
}
