/* Link - https://www.codechef.com/problems/NOTDIVISIBLE */

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
		Scanner scan = new Scanner(System.in);
		int T= scan.nextInt();
		while(T-->0)
		{
		    int n= scan.nextInt();
		    for(int i=0;i<n;i++)
		    {
		        if(i%2==0)
		         System.out.print("1 ");
		        else
		         System.out.print("0 ");
		    }
		}
	}
}
