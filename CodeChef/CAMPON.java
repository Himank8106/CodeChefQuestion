/* Link - https://www.codechef.com/problems/CAMPON */

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
            int[] d = new int[n];
            int[] p = new int[n];
            for(int i=0; i<n; i++){
                d[i] = sc.nextInt();
                p[i] = sc.nextInt();
            }
            int q = sc.nextInt();
            int[] de = new int[q];
            int[] r = new int[q];
            for(int i=0; i<q; i++){
                de[i] = sc.nextInt();
                r[i] = sc.nextInt();
            }
            int[] problems = new int[32]; 
            for (int i = 0; i < n; i++) {
                problems[d[i]] = p[i];
            }
            int sum = 0;
            int[] cumulativeSums = new int[32];
            for (int i = 0; i < 32; i++) {
                sum += problems[i];
                cumulativeSums[i] = sum;
            }
            for (int i = 0; i < q; i++) {
                if (r[i] <= cumulativeSums[de[i]]) System.out.println("Go Camp");
                else System.out.println("Go Sleep");
            }
        }
	}
}
