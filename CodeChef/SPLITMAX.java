/* Link - https://www.codechef.com/problems/SPLITMAX */

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
            long sum = 0;
            for(int i=0; i<n; i++){
                sum = (sum+sc.nextInt())%998244353;
            }
            long InterSum = (sum*(sum-1))%998244353;
            System.out.println(InterSum);
        }
	}
}
