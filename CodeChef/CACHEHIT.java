/* Link - https://www.codechef.com/problems/CACHEHIT */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int u=0;u<t;u++)
		{
		    int n = sc.nextInt();
		    int b = sc.nextInt();
		    int m = sc.nextInt();
		    int s=1;
		    int a[]= new int[m];
		    for(int j=0;j<m;j++)
		    {
		        a[j]= sc.nextInt();
		    }
		    for(int i=0;i<m-1;i++)
		    {
		        if(a[i]/b==a[i+1]/b)
		        {
		            s=s;
		        }
		        else
		        {
		            s=s+1;
		        }
		    }
		    System.out.println(s);
		}

	}
}
