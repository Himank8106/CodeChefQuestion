/* Link - https://www.codechef.com/problems/SIMPLE_XOR */

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
            int l = sc.nextInt(), r = sc.nextInt();
            if((l&1)==0){
                System.out.println(l+" "+(l+1)+" "+(l+2)+" "+(l+3));
            }
            else{
                if(l+4<=r) System.out.println((l+1)+" "+(l+2)+" "+(l+3)+" "+(l+4));
                else System.out.println(-1);
            }
        }
	}
}
