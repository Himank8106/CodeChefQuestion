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
		    int n = sc.nextInt(), m = sc.nextInt(), k;
		    for(int i=n; i<=m; i++){
		        k=1;
		        for(int j=2; j*j<=i; j++){
		            if(i%j==0){
		                k=0;
		                break;
		            }
		        }
		        if(k==1 && i!=1){
		            System.out.println(i);
		        }
		    }
		}
	}
}
