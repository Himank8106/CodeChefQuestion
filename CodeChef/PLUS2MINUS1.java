/* Link - https://www.codechef.com/problems/PLUS2MINUS1 */

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
		int T = sc.nextInt();
		while(T-->0){
		    int Y = sc.nextInt();
		    int num = 0;
		    
		    if(Y==0){
		        System.out.println(1);
		    }else{
		        num = 3 * Y;
		        System.out.println(num);
		    }
		}
	}
}
