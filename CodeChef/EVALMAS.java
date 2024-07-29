/* Link - https://www.codechef.com/problems/EVALMAS */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int t=input.nextInt();
		while(t-- !=0)
		{
		  int n=input.nextInt();
		  int x=input.nextInt();
		  if(x>0)
		  {
		    if(x>(n+1)) System.out.print("-1");
		    else if(x==(n+1))
		    {
		      for(int i=0;i<n;i++) System.out.print("+");
		    }
		    else if(x<=n)
		    {
		      for(int i=0;i<x-1;i++) System.out.print("+");
		      for(int i=0;i<(n-(x-1));i++) System.out.print("*");
		    }
		  }
		  else if(x<0)
		  {
		    if(n<=Math.abs(x)) System.out.print("-1");
		    else if((n-1)==Math.abs(x))
		    {
		      for(int i=0;i<n;i++) System.out.print("-");
		    }
		    else if(n>Math.abs(x))
		    {
		      for(int i=0;i<(Math.abs(x)+1);i++) System.out.print("-");
		      for(int i=0;i<(n-(Math.abs(x)+1));i++) System.out.print("*");
		    }
		  }
		  else if(x==0)
		  {
		    System.out.print("-");
		    if(n>1)
		    {
		      for(int i=0;i<n-1;i++) System.out.print("*");
		    }
		  }
		  
		  System.out.println();
		  
		}
	}
}
