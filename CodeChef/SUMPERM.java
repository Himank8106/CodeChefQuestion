/* Link - https://www.codechef.com/problems/SUMPERM */

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
            if(n%2==1){
                System.out.println(-1);
            }
            else{
                for(int i=1; i<=n; i+=2){
                    System.out.print(i+1+" "+i+" ");
                }
                System.out.println();
            }
        }
	}
}
