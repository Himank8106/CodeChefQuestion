/* Link - https://www.codechef.com/problems/ONEFROMK */

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
            long sum=0;
            long[] arr = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextLong();
                sum += arr[i];
            }
            Arrays.sort(arr);
            System.out.print(sum+" ");
            for(int i=0; i<n-1; i++){
                System.out.print((sum-arr[i])+" ");
                sum -= arr[i];
            }
            System.out.println();
        }
	}
}
