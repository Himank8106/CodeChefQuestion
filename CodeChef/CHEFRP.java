/* Link - https://www.codechef.com/problems/CHEFRP */

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
            }
            Arrays.sort(arr);
            if(arr[0]<2) System.out.println(-1);
            else if(n==1) System.out.println(2);
            else{
                for(int i=n-1; i>=1; i--){
                    sum += arr[i];
                }
                System.out.println(sum+2);
            }
        }
	}
}
