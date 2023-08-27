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
		    int x=sc.nextInt(), y=sc.nextInt(), z=sc.nextInt();
		    System.out.println((x+y==z || x+z==y || y+z==x)?"yes":"no");
		}
	}
}

/*
Given that: A = B + x; B = C + y; C = A + z;
=> A = A + x + y + z; => x + y + z = 0;

So we check all combinations of operation, because x or y or z can be negative 
and we are given mod.
if x+y+z comes to be zero then print yes, otherwise print no.
*/
