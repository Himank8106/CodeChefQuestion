/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LOSTWKND
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0){
		    int h = sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt();
		    h *= sc.nextInt();
		    System.out.println(h<=120?"No":"Yes");
		} 
	}
}
