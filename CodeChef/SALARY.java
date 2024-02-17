/* Link - https://www.codechef.com/problems/SALARY */

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
            int n = sc.nextInt(), sum=0;
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            Arrays.sort(arr);
            System.out.println(sum-(n*arr[0]));
        }
	}
}
