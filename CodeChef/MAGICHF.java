/* Link - https://www.codechef.com/problems/MAGICHF */

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
		    int n = sc.nextInt(), x = sc.nextInt(), s = sc.nextInt();
		    for(int i=0; i<s; i++){
		        int a = sc.nextInt(), b = sc.nextInt();
		        if(a==x || b==x){
		            x = a+b-x;
		        }
		    }
		    System.out.println(x);
		}
	}
}
