/* Link - https://www.codechef.com/problems/BAB_I */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long p = Integer.MAX_VALUE;
            long q = Integer.MIN_VALUE;
            for (int x : arr) {
                if (x >= 0) p = Math.min(p, x);
                else q = Math.max(q, x); // q is long to avoid overflow
            }
            long absQ = Math.abs(q); // Compute absolute value of q
            int ans = (int) Math.min(p, absQ); // Cast result back to int safely
            System.out.println(ans - 1);
        }
        sc.close();
    }
}

/*
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int N;
	    int A[];
	    int i;
	    
		Scanner sc = new Scanner(System.in);
		for(i = sc.nextInt();i>0;i--)
		{
		    int max = 0;
		    N = sc.nextInt();
		    A = new int[N];
		    for (int j=0;j<N ;j++ ) 
		    {
		        A[j]=sc.nextInt();
		        
		    }
		    Arrays.sort(A);
		     max = Math.abs(A[N-1]);
		   
		    //for(int j = N-1;j>=0;j--)
		    //{
		        
		        for(int k =N-1;k>=0;k--)
		        {
		            if(Math.abs(A[k])<=max)
		            max = Math.abs(A[k]);
		            
		        }
		    //}
		   
		    System.out.println(max-1);
		}
	}
}
*/
