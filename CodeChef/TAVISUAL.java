/* Link - https://www.codechef.com/problems/TAVISUAL */

import java.util.*;
import java.lang.*;
import java.io.*;
 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int u=0;u<t;u++)
		{
		    int n = sc.nextInt();
		    int c=sc.nextInt();
		    int q= sc.nextInt();
		    
		    for(int i=0;i<q;i++)
		    {
		        int l = sc.nextInt();
		        int r= sc.nextInt();
		        if(c<=r&&c>=l)
		        {
		            c=r-c+l;
		        }
		    }
		    System.out.println(c);
		}
		        

	}
}
