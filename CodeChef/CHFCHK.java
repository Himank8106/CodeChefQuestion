/* Link - https://www.codechef.com/problems/CHFCHK */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0) {
		    int n=s.nextInt();
		    int arr[]=new int[n];
		    for(int i=0; i<n; i++) arr[i]=s.nextInt();
		    
		    int ans=arr[0];
		    for(int i=1; i<n; i++) {
		        if(arr[i]<ans) {
		            ans=arr[i];
		        }
		    }
		    System.out.println(ans);
		    
		}

	}
}
