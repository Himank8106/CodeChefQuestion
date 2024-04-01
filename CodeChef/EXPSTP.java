/* Link - https://www.codechef.com/problems/EXPSTP */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  public static long min(long a, long b)
	  {
	    if(a>=b)
	    {
	      return b;
	    }
	    else
	    {
	      return a;
	    }
	  }
	  
	  public static long max(long a, long b)
	  {
	    if(a>=b)
	    {
	      return a;
	    }
	    else
	    {
	      return b;
	    }
	  }
  
	public static void main (String[] args) throws java.lang.Exception
	{
	  
	  
		try {
		  Scanner input=new Scanner(System.in);
		  int t=input.nextInt();
		  while(t-- !=0)
		  {
		    long n=input.nextLong();
		    long x1=input.nextLong();
		    long y1=input.nextLong();
		    long x2=input.nextLong();
		    long y2=input.nextLong();
		    
		    if(n==1)
		    {
		      System.out.println("0");
		    }
		    else
		    {
		    
		    
		    long direct1=(max(x1,x2)-min(x1,x2));
		    long direct2=(max(y1,y2)-min(y1,y2));
		    long direct=(direct1+direct2);
		    
		    if(x1>(n/2))
		    {
		      x1=(n-x1)+1;
		    }
		    if(y1>(n/2))
		    {
		      y1=(n-y1)+1;
		    }
		    if(x2>(n/2))
		    {
		      x2=(n-x2)+1;
		    }
		    if(y2>(n/2))
		    {
		      y2=(n-y2)+1;
		    }
		    
		    
		    long indirect1=(min(x1,y1));
		    long indirect2=(min(x2,y2));
		    long indirect=(indirect1+indirect2);
		    
		    long ans=min(indirect,direct);
		    
		    System.out.println(ans);
		    
		    }
		  }
		} catch(Exception e) {
		}
	}
}
