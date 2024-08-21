/* Link - https://www.codechef.com/problems/GCDPERM */

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
            int n = sc.nextInt(), k = sc.nextInt();
            int x = n/k;
            for(int i=1; i<=k; i++) System.out.print((x*i)+" ");
            System.out.println();
        }
	}
}
