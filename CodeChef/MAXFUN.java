/* Link - https://www.codechef.com/problems/MAXFUN */

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
		while(t-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		   	long x= arr[0];
			long y = arr[n-1];
			long z = arr[1];
			long ans1 = Math.abs(x-y);
			long ans2 = Math.abs(y-z);
			long ans3 = Math.abs(z-x);
			long ans = ans1+ans2+ans3;
			System.out.println(ans);
		}
	}
}
