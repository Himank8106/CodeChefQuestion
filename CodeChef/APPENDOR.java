/* Link - https://www.codechef.com/problems/APPENDOR */

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
		while(t-- > 0 ){
		    int n = sc.nextInt();
		    long y = sc.nextLong();
		    long a[] = new long[n];
		    for (int i = 0 ; i < n ; i++ ) a[i] = sc.nextLong();
		    long or = 0;
		    for( long e : a ) or |= e;
		    long val = ( y ^ or );
		    if( (or | val) == y  ){
		        System.out.println( val );
		    }
		    else{
		        System.out.println( -1 );
		    }
		}
	}
}
