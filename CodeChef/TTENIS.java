/* Link - https://www.codechef.com/problems/TTENIS */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
		// your code goes here
	  String s=sc.next();
		    int count0=0;
		    int count1=0;
		    for(int i=0;i<s.length();i++)
		    {
		        if(s.charAt(i)=='1')
		        {
		            count1++;
		        }
		        else{
		            count0++;
		        }
		    }
		        if(count1>count0){
		            System.out.println("WIN");
		        }
		        else{
		            System.out.println("LOSE");
		        }
		}
	}
}
