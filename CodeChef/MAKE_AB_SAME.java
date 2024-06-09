/* Link - https://www.codechef.com/problems/MAKE_AB_SAME */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    private static boolean makeSameArray(int arr[],int []brr,int n,boolean tag)
    {
        if(arr[0]!=brr[0] || arr[n-1]!=brr[n-1])
          return false;
        
        
        
        for(int i=1;i<n-1;i++)
        {
            
            if(arr[i]==1 && brr[i]==0)
            {
                return false;
            }
            else if(arr[i]==0 && brr[i]==1 && !tag)
            {
                  return false;
            }
        }
        return true;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T= scan.nextInt();
		while(T-->0)
		{
		    int n= scan.nextInt();
		    int []arr= new int[n];
		    int []brr= new int[n];
		    boolean tag=false;
		    for(int i=0;i<n;i++)
		    {
		      arr[i]= scan.nextInt();
		      if(arr[i]==1)
		        tag=true;
		    }
		    for(int i=0;i<n;i++)
		      brr[i]= scan.nextInt();
		    boolean ans= makeSameArray(arr,brr,n,tag);
		    if(ans)
		      System.out.println("YES");
		    else
		      System.out.println("NO");
		}
	}
}
