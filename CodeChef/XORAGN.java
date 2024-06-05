/* Link - https://www.codechef.com/problems/XORAGN */

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
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int k=0;k<T;k++){
		    int n=s.nextInt();
		    int a[]=new int[n];
		    for(int l=0;l<n;l++){
		        a[l]=s.nextInt();
		    }
		    int res=0;
		    for(int i=0;i<n;i++){
		        res=res^(2*a[i]);
		    }
		    System.out.println(res);
		}
	}
}
