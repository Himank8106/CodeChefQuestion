/* Link - https://www.codechef.com/problems/MSNSADM1 */

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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), max=0;
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    int[] arr1 = new int[n];
		    for(int i=0; i<n; i++){
		        arr1[i] = sc.nextInt();
		    }
		    for(int i=0; i<n; i++){
		        if(arr[i]*20-arr1[i]*10 > max){
		            max = arr[i]*20-arr1[i]*10;
		        }
		    }
		    System.out.println(max);
		}
	}
}
