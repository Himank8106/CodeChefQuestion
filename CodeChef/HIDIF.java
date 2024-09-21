/* Link - https://www.codechef.com/problems/HIDIF */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i<n; i++){
		        arr[i]=sc.nextInt();
		    }
		    
		    int max=0;
		    for(int i = 0; i<n; i++){
		        int temp = arr[i];
		        int j = 1;
		        while(j<=k){
		            int sum=0;
		            arr[i]=j;
		            for(int m = 0; m<n-1; m++){
		                sum+=Math.abs(arr[m]-arr[m+1]);
		            }
		            max=Math.max(sum,max);
		            j=j+k-1;
		        }
		        arr[i]=temp;
		    }
		    System.out.println(max);
		}

	}
}
