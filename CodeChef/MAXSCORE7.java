/* Link - https://www.codechef.com/problems/MAXSCORE7 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int zero=0,one=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==0)
		           zero++;
		        else
		            one++;
		    }
		    if(one>zero)
		    {
		        System.out.println(zero);
		    }
		    else
		    {
		        System.out.println(one);
		    }
		}

	}
}
