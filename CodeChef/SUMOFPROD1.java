/* Link - https://www.codechef.com/problems/SUMOFPROD1 */

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
		int n = sc.nextInt();
		for(int i = 0 ; i<n ; i++)
		{
		    int a = sc.nextInt();
		    int arr[] = new int[a];
		    long sum = 0;
		    long count = 0;
		    for(int j = 0 ; j<a ; j++)
		    {
		        arr[j] = sc.nextInt();
		    }
		    for(int k = 0 ; k<a ; k++)
		    {
		        if(arr[k]==1)
		        {
		            count++;
		        }
		        else
		        {
		            sum = sum + (count*(count+1)/2);
		            count=0;
		        }
		    }
		    sum = sum+(count*(count+1)/2);
		    System.out.println(sum);
		}
	}
}
