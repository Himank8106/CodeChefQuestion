/* Link - https://www.codechef.com/START103D/problems/BRUNCH */

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
		    int p = sc.nextInt(), p1 = sc.nextInt();
		    int ans = p/p1;
		    if(ans>20){
		        System.out.println(20);
		    }
		    else{
		        System.out.println(ans);
		    }
		}
	}
}
