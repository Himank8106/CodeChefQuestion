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
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int j=0; j<n; j++){
	          arr[j]  = sc.nextInt();
	        }
	        int count = 0;
	        for(int j=0; j<n-1; j++){
	            if(arr[j]>arr[j+1]){
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	                break;
	            }
	        }
	        for(int j=0; j<n-1; j++){
	            if(arr[j]>arr[j+1]){
	                count++;
	            }
	        }
	        System.out.println((count==0)?"YES":"NO");
	    }
	}
}
