/* Link - https://www.codechef.com/problems/ARYAGRID */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    long x=sc.nextInt(), y=sc.nextInt() ,n=sc.nextInt(),
		    m=sc.nextInt(),
		    k=sc.nextInt(),
		    up = (n-1)/k,
		    bottom = (x-n)/k,
		    left = (m-1)/k,
		    right = (y-m)/k,
		    cal = (up+bottom)*(right+left);
		    
		    if(k==1) System.out.println(x*y);
		    else
		    {
		        System.out.println(cal+right+left+up+bottom+1);
		    }
		}
	}
}
