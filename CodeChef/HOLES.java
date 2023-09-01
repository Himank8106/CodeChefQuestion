/* Link - https://www.codechef.com/problems/HOLES */

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
        for (int i = 0; i < t; i++) {
            String str = sc.next();
            int count =0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='A' || str.charAt(j)=='D' || str.charAt(j)=='O' || str.charAt(j)=='P' || str.charAt(j)=='Q' || str.charAt(j)=='R'){
                    count++;
                } else if (str.charAt(j)=='B') {
                    count = count + 2;
                }
            }
            System.out.println(count);

       }
	}
}
